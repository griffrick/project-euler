package barkle.garfin;

import barkle.garfin.number1.Number1;
import barkle.garfin.number2.Number2;

public class Main {

    public static void main(String[] args){
//        System.out.println(doNumber1(1000));
//        System.out.println(doNumber2(4000000));
    }

    private static int doNumber1(int upperLimit){
        return new Number1(1000).getValue();
    }

    private static int doNumber2(int fibLimit) {
        return new Number2(fibLimit).getValue();
    }

    private static int doNumber3(int toFactor){
        return 0;
    }

}