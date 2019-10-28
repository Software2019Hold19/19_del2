package com.company;


import java.io.IOException;

public class Main {

    static GUI board = new GUI();
    static boolean isPlayer1 = true;
    static boolean hasWon = false;

    private static void winCheck(Player p){
        if (p.acc.getBalance() >= 3000){
            hasWon = true;
        }
    }

    //ending turn and switching isPlayer1
    private static void endTurn(boolean extra){
        if (!hasWon) {
            isPlayer1 = !isPlayer1;
            if (extra) { //if player is getting an extra turn, isPlayer Switches again
                isPlayer1 = !isPlayer1;
                // FIXME: 28-10-2019 gui write out player gets extra turn.
            }
        }
    }

    private static void playerTurn(Player player, Field[] fieldList, Translator translator){
        board.showMessage(String.format(translator.txts.get(15), player.name));
        int[] roll = player.roll();
        int sum = roll[0] + roll[1];
        int field = sum - 2;
        String txt = fieldList[field].txt;
        int val = fieldList[field].val;
        boolean extra = fieldList[field].extra;

        player.acc.addBalance(val); //updates balance i players Account object
        player.getGuiPlayerObj().setBalance(player.acc.getBalance()); //updating the balance of the players GUI_Player object and updating it on the board

        board.setDice(roll[0], roll[1]);

        board.moveCar(sum, player);
        player.oldFieldNumber = sum;
        board.showMessage(String.format(translator.txts.get(16), roll[0], roll[1], sum));
        board.showMessage(String.format(translator.txts.get(field)));
        
        winCheck(player);

        endTurn(extra);

    }

    // setup field list
    private static void initFieldList(Field[] fields, Translator translator){
        int[] vals = new int[]{250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
        for (int i = 0; i < 11; i++){
            boolean extra = false;
            if (i == 8){
                extra = true;
            }
            fields[i] = new Field(translator.txts.get(i), vals[i], extra);
        }
    }

    // Setup fields in GUI with selected language
    private static void initGame(Field[] fields) {

        int count = 2;
        for (Field f : fields) {
            board.setFieldTitle(count, f.name);
            board.setFieldText(count, "" + f.val);
            board.setFieldDescription(count, f.txt);
            count++;
        }

    }

    // Where the game starts
    private static void startGame(Player p1, Player p2, Field[] fields, Translator translator){ // FIXME: 25-10-2019 init players, fields and GUI

 
        while (!hasWon) {
            if (isPlayer1) {
                playerTurn(p1, fields, translator);
            }
            else {
                playerTurn(p2, fields, translator);
            }
        }
        
        String winner;
        if (isPlayer1){
            winner = p1.name;
        } else {
            winner = p2.name;
        }
        board.showMessage(String.format(translator.txts.get(17), winner));

    }

    public static void main(String[] args) throws IOException {
	    Field[] fieldList = new Field[11];
        
        // Selected language from user
        String selectedL = board.getPlayerDropbown("Vælg Sprog / Choose Language", "Dansk", "English");

        //Setup translater with selected language
        Translator translator = new Translator(selectedL);
        initFieldList(fieldList, translator);
        initGame(fieldList);

        board.showMessage(translator.txts.get(11));
        
        // Init players
        Player player1 = new Player(board.getUserString(translator.txts.get(12)));
        Player player2 = new Player(board.getUserString(translator.txts.get(13)));

        // Adding players to playboard
        board.addPlayerToBoard(player1);
        board.addPlayerToBoard(player2);

        board.showMessage(String.format(translator.txts.get(14), player1.name, player2.name));
        
        startGame(player1, player2, fieldList, translator);
    }
}