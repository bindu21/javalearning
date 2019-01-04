package com.bindu;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int ret = 0;
        ret = calculateHighScorePosition(1500);
        displayHighScore("Bindu", ret);

        ret = calculateHighScorePosition(900);
        displayHighScore("Manish", ret);

        ret = calculateHighScorePosition(400);
        displayHighScore("Adhrit", ret);

        ret = calculateHighScorePosition(50);
        displayHighScore(ret);

        ret = calculateHighScorePosition(50);
        displayHighScore(ret,4);
    }

    public static void displayHighScore(String name, int pos) {
        System.out.println(name + " managed to get into position " + pos +
                " into the high score table");
    }

    public static void displayHighScore(int pos) {
        System.out.println("Unnamed managed to get into position " + pos +
                " into the high score table");
    }

    public static boolean displayHighScore(int pos,boolean flag) {
        System.out.println("Unnamed managed to get into position " + pos +
                " into the high score table");
        return true;
    }

    public static void displayHighScore(int pos1,int pos2) {
        System.out.println("Unnamed managed to get into position " + (pos1 + pos2) +
                " into the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000)
            return 1;
        else if (500 <= score)
            return 2;
        else if (score >= 100)
            return 3;
        return 4;
    }

}
