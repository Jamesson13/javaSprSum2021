package com.hillel.lesson_04;

public class MainStudent {
    public static void main(String[] args) {
//        Student st1 = new Student();
//        System.out.println(st1.toString());

        Student st2 = new Student("FN", "LN");
        st2.setAge(12);
        st2.setPhone("12345678765");
        System.out.println(st2.toString());

        Student st3 = new Student("FN", "LN", 23, "3806767676767");
        System.out.println(st3.toString());


    }
}
