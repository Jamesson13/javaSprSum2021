package com.hillel.lesson_05;

public class UserRun {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        User u3 = u2;

        u2.setFullName("test name");
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u3);

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u3.hashCode());

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u3));
    }
}
