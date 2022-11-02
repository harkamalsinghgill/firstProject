package com.JavaProject.loops;

public class nestedLoops {
    // print STAR * pattern
    public static void main(String[] args) {
        for (int line = 1 ; line <= 19; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
