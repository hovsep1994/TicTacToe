package com.aca.tictactoe;

public class StringUtils {

    public static boolean areEqual(String s1, String s2, String s3) {
        return s1.equals(s2) && s1.equals(s3);
    }

    public static boolean areNotEqual(String s1, String s2) {
        return !s1.equals(s2);
    }

}
