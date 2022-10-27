package com.richa_java;

import java.util.Scanner;

public class Calculator {

    public static void sum(int a, int b){
        int sum = a + b;
        System.out.println("Addition of a & b :" + sum);

    }

    public static void sub( int a, int b ){
        int sub = a -b;
        System.out.println("Subtraction of a & b :" + sub);
        }

    public static void mult( int a, int b ){
        int mult = a*b;
        System.out.println("Multiplication of a & b :" + mult);

}
    public static void division( int a, int b ){
        int div = a/b;
        System.out.println("Division of a & b :" + div);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
        sub(a,b);
        mult(a,b);
        division(a,b);
    }

}






