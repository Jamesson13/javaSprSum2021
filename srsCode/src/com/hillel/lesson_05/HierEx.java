package com.hillel.lesson_05;

public class HierEx {
    public static void main(String[] args) {
        Hier h = new Hier();
        Hier h1 = new Hier();

        System.out.println(h.getClass().getName());

        System.out.println(h.toString());

        System.out.println(h.hashCode());

        System.out.println(h1 == h);
        System.out.println(h1.equals(h));

    }
}
