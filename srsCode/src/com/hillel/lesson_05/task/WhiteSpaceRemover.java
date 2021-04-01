package com.hillel.lesson_05.task;

public class WhiteSpaceRemover {
    // Напишите Java-программу для удаления всех пробелов из строки без использования replace().

    public static void main(String[] args) {
        String str = " Hello World Напишите Java-программу для удаления всех пробелов из строки без использования replace().";
        // 1. replace

        System.out.println(str.replace(" ", ""));

        // 2. without replace
        String tmp = "";
        System.out.println(str.toCharArray().length);
        for (char c : str.toCharArray()){
            if (c != ' ') tmp = tmp.concat(String.valueOf(c));
        }
        System.out.println(tmp);

        // 3. without replace
        tmp = "";
        System.out.println(str.split(" ").length);
        for (String c : str.split(" ")){
            tmp = tmp.concat(c);
        }
        System.out.println(tmp);
    }
}
