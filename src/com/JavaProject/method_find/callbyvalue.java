package com.JavaProject.method_find;

public class callbyvalue {

    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
// Reason we print in swap function because if we print in main function,value of a & b will be same 5 and 8.
// Functions in java always work on call by value, means only copy of data will go to artificial function not original.
// if we try to print value of a & b in main function, it will give me 5 and 8 as it is not 8 and 5.

    public static void main(String[] args) {

        int a = 5, b = 8;

        swap(5, 8);
    }
}
