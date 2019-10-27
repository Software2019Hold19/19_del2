package com.company;


public class Main {

    private static void playerTurn(Player player, Field[] fieldList){
       // int[] roll = player.roll();
        //int sum = roll[0] + roll[1];
        //info = fieldList[sum - 1].getInfo


    }
    
    private static void startGame(){ // FIXME: 25-10-2019 init players, fields and GUI
       GUI board = new GUI();
  /*      Player p = new Player("Oliver", 6);
        board.setDice(1,2);
        board.addPlayerToBoard(p);
        board.moveCar(5, p);
        board.setFieldText(1,"true");
   */
       // board.getPlayerDropbown("ja");

    }

    public static void main(String[] args) {
	    //Field[] fieldList;
        //System.out.println(String.format("this is %ss saying hi to %s", "Frederik", "Jacob"));
        startGame();

    }
}
