package edu.trincoll.dchitrak.mathgame;

public class Hex extends GenerateProblem {
    public Hex(int min, int max) {
        super(min, max);
    }


    public void makeProblem(){
        super.makeProblem();

    }

    public String getNum1(){
        return Integer.toHexString(num1);
    }

    public String getNum2(){
        return Integer.toHexString(num2);
    }

    public String getResults(){
        return Integer.toHexString(results);
    }
}
