package chapter3;

public class PatternMatching {
    /**
     * SWITCH CASE
     * A program that will check if an object is a String or an integer or something else.
     * If it is a String then the system will print out "It's a string"
     * If it is an integer then the system will print out "It's an integer"
     * If it is any other object then the system will print out "It's something else"
     * @param obj This is the value to be checked whether it's a string, or an integer or any other value
     */
    public static String test(Object obj) {

        return switch (obj) {
            case String s -> "It's a string " + s;
            case Integer i -> "It's an integer " + i;
            default -> "It's something else";

        };
    }
    public static void main(String[] args) {
        System.out.println(test("hello"));
        System.out.println(test(123));
        System.out.println(test(3.14));


    }


}


