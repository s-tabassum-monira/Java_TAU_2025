package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {

        // Employee employee = new Employee();
//        Rectangle rectangle = new Rectangle();
//        rectangle.print();
//
//        Square square = new Square();
//        square.print("Square is my name!");

        Mother mom = new  Mother();
        mom.setName("Shikha");
        System.out.println(mom.getName() + " is a " + mom.getGender());


    }
}
