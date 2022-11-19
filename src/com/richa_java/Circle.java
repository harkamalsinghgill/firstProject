package com.richa_java;

public class Circle {

    int r;
    private int z=10;
    void calculateArea( int r) {
        System.out.println(3.14 * r * r);
    }

    void calculateCircumference(int r) {
        System.out.println(3.14 * 2 * r);
    }



    public static void main(String[] args) {

        Circle hs = new Circle();
        hs.calculateArea(5);
        hs.calculateCircumference(4);

    }


}