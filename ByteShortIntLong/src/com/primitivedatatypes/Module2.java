package com.primitivedatatypes;

import java.lang.management.PlatformLoggingMXBean;

public class Module2 {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(9008);
        displayHighScorePosition("Abhi", highScorePosition);
        highScorePosition = calculateHighScorePosition(600);
        displayHighScorePosition("Ram", highScorePosition);
        highScorePosition = calculateHighScorePosition(200);
        displayHighScorePosition("Hitler", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " Managed to get to this position " + highScorePosition + " On the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000) {
            position =1;
        } else if (playerScore >= 500 ) {
            position =2;
        } else if (playerScore >= 100) position =3;
        else {position =4;}
        return position;

    }

}



