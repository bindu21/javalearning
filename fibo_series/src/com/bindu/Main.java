package com.bindu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x=0;
        int y = 1;
        int n=10,temp=0;
        for (int j = 0; j < n; j++) {
            System.out.println(x);
            temp=x;
            x=y;
            y=temp+y;
        }
        int istrue = n > 10 ? 20:5;
        System.out.println(istrue);

        double mydob = 20d;
        double mysecdob = 80d;
        double result = 25d*(mydob+mysecdob);
        double mynum = result%40d;
        System.out.println("result is "+result+" and mynum is = "+mynum);
        if(mynum <= 20){
            System.out.println("Total was over the limit");
        }
    }
}
