package com.bindu;

public class Main {

    public static void main(String[] args) {

        byte myByteNum = 10;
        short myShortNum = 20;
        int myIntNum = 50;
        long myLongNum = 50000L + (10L*(myByteNum+myIntNum+myShortNum));
        short total = (short)(1000+10*(myByteNum+myIntNum+myShortNum));
        System.out.println("final value = "+ myLongNum);
        System.out.println("Short total = "+total);

        /*pound to kg converter*/
        double pound = 107.89d;
        double pToKg = 0.45349237d * pound;
        System.out.println("New value = "+pToKg);

        String myStr="Hello my first string";
        System.out.println(myStr);
        myStr = myStr + "\nadding new text in it";
        System.out.println(myStr);
    }
}
