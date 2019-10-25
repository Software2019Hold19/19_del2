package com.company;
import java.util.Random;

public class Die {

    private int sides;
    private int faceValue;

    public Die(int _sides){     //constructor
        if(_sides > 0){
            this.sides = _sides;
        }
        else{
            this.sides = 6;     //sætter til standard 6 sider - evt. print fejlmeddelelse for ugyldigt input
        }
    }

    public int roll(){
        Random random = new Random();
        faceValue = random.nextInt(sides) + 1;
        return faceValue;
    }
}
