package com.hillel.lesson_04;

public class Konstr {
    int a;
    int b;

    public Konstr() {
    }

    public Konstr(int a) {
        System.out.println("konstr : a");
        this.a = a;
    }

    public Konstr(int a, int b) {
        this(a);
        System.out.println("konstr : a, b ");
        this.b = b;
    }

    void printParam(){
        System.out.println("a = " + a + "; b = " + b);
    }
}
