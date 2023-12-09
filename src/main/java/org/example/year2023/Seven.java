package org.example.year2023;

public class Seven {

    public static char[] hand1 = {'3', '2', 'T', '3', 'K'};

    public static boolean isFiveOfAKind(char[] hand1) {
    for (int i =0; i<hand1.length; i++) {
        if (hand1[i] == hand1[0]) {
            return false;
        }
    }
        return true;
    }




    }

