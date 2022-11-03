package com.JavaProject.method_find;

import java.util.Scanner;

public class factorialnumberN {
    //7 //Calculate Factorial of a number n
    // n! = n * (n-1) * (n-2)....n!

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }

        return f;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        factorial(a);
        System.out.println(factorial(a));

    }

}
