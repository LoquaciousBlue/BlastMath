package edu.trincoll.dchitrak.mathgame;

public class Decimal extends GenerateProblem {
    public Decimal(int min, int max) {
        super(min, max);
    }

    public void makeProblem(){

        opNum = rand.nextInt(4);

        if (opNum == 0){
            op = "+";
            results = num1+num2;
        }else if(opNum == 1){
            op = "-";
            results = num1-num2;
        }else if(opNum == 3){
            op = "x";
            results = num1*num2;
        }else{
            op = "/";
            results = (num1%num2)+rand.nextInt((max-min)*2);
            num1 = num2*results;
        }
    }



}
