package com.company;


public class Main {

    static GUI board = new GUI();
    static boolean isPlayer1 = true;

    private static void playerTurn(Player player, Field[] fieldList){
        int[] roll = player.roll();
        int sum = roll[0] + roll[1];
        int field = sum - 2;
        String txt = fieldList[field].txt;
        int val = fieldList[field].val;
        boolean extra = fieldList[field].extra;

        player.acc.addBalance(val);

        // FIXME: 28-10-2019 GUI set dice roll[0] & roll[1]
        board.setDice(roll[0], roll[1]);

        // FIXME: 28-10-2019 GUI write txt
        board.showMessage("Du har slået");

        // FIXME: 28-10-2019 Check win method

        // FIXME: 28-10-2019 Check extra turn method

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

        int count = 1;
        for (Field f : fields) {
            board.setFieldText(count, f.name);
            board.setFieldText(count, "" + f.val);
            count++;
        }

    }

    // Where the game starts
    private static void startGame(Player p1, Player p2, Field[] fields){ // FIXME: 25-10-2019 init players, fields and GUI

  /*      Player p = new Player("Oliver", 6);
        board.setDice(1,2);
        board.addPlayerToBoard(p);
        board.moveCar(5, p);
        board.setFieldText(1,"true");
   */
       // board.getPlayerDropbown("ja");

        while (true) {
            if (isPlayer1) {

            }
        }



    }

    public static void main(String[] args) {
	    Field[] fieldList = new Field[11];
	    //System.out.println(String.format("this is %ss saying hi to %s", "Frederik", "Jacob"));

        Player player = new Player("1");
        System.out.println(player.acc.getBalance());

        // Selected language from user
        String selectedL = board.getPlayerDropbown("Vælg Sprog", "Dansk", "Engelsk");

        //Setup translater with selected language
        Translator translator = new Translator(selectedL);
        initFieldList(fieldList, translator);
        initGame(fieldList);

        // Init players
        Player player1 = new Player(board.getUserString("Spiller 1 navn"));
        Player player2 = new Player(board.getUserString("Spiller 2 navn"));

        // Adding players to playboard
        board.addPlayerToBoard(player1);
        board.addPlayerToBoard(player2);

        startGame(player1, player2, fieldList);
    }
}