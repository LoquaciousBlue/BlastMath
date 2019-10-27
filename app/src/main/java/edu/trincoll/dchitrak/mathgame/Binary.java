package edu.trincoll.dchitrak.mathgame;

public class Binary extends GenerateProblem {

    public Binary(int min, int max) {
        super(min, max);
    }

    public Binary(){
        super();
    }

    public void makeProblem(){
        super.makeProblem();
    }

    public String getNum1(){
        return Integer.toBinaryString(num1);
    }

    public String getNum2(){
        return Integer.toBinaryString(num2);
    }

    public String getResults(){
        return Integer.toBinaryString(results);
    }

}
