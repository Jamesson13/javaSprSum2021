package com.hillel.lesson_04;

public class KonstrMain {
    public static void main(String[] args) {
        Konstr k = new Konstr();

        k.printParam();

        k.a = 10;
        k.b = 20;

        k.printParam();

        k = new Konstr(2, 3);

        k.printParam();
    }
}
