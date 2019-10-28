package com.company;


public class Main {

    static GUI board = new GUI();

    private static void playerTurn(Player player, Field[] fieldList){
        int[] roll = player.roll();
        int sum = roll[0] + roll[1];
        int field = sum - 1;
        String txt = fieldList[field].txt;
        int val = fieldList[field].val;
        boolean extra = fieldList[field].extra;

        player.acc.addBalance(val);

        // FIXME: 28-10-2019 GUI set dice roll[0] & roll[1]
        // FIXME: 28-10-2019 GUI write txt

        // FIXME: 28-10-2019 Check win method

        // FIXME: 28-10-2019 Check extra turn method

    }

    private static void initFieldList(Field[] fields){
        for (int i = 0; i < 11; i++){

        }
    }

    private static void initGame(Field[] fields) {

        int count = 1;
        for (Field f : fields) {
            board.setFieldText(count, f.name);
            board.setFieldText(count, "" + f.val);
            count++;
        }

    }

    private static void startGame(){ // FIXME: 25-10-2019 init players, fields and GUI

  /*      Player p = new Player("Oliver", 6);
        board.setDice(1,2);
        board.addPlayerToBoard(p);
        board.moveCar(5, p);
        board.setFieldText(1,"true");
   */
       // board.getPlayerDropbown("ja");

    }

    public static void main(String[] args) {
	    Field[] fieldList = new Field[11];

        //System.out.println(String.format("this is %ss saying hi to %s", "Frederik", "Jacob"));

        Player player = new Player("1",)
        System.out.println();

        String selectedL = board.getPlayerDropbown("Vælg Sprog", "Dansk", "Engelsk");

        if (selectedL.equals("Dansk"))
            System.out.println("Dansk");
        else
            System.out.println("Ikke dansk");
        initFieldList(fieldList);
        initGame(fieldList);
        startGame();
    }
}