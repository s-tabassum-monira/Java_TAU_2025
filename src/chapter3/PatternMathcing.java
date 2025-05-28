package chapter3;

import java.util.Scanner;


public class PatternMathcing {
    public static void main(String[] args) {
        System.out.println(test("hello"));
        System.out.println(test(123));
        System.out.println(test(3.14));


    }

    static String test(Object obj) {

        return switch (obj) {
            case String s -> "It's a string " + s;
            case Integer i -> "It's an integer " + i;
            default -> "It's something else";

        };
    }
}


