package com.hillel.lesson_04;

public class Clazz {
    static private int index = 15;
    int value;

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Clazz.index = index;
    }

    public int getValue() {
        return value;
    }

    public int calc(){
        return index + value;
    }
}
