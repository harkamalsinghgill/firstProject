package com.JavaProject.loops;


import java.util.Scanner;

public class assignmentLoops {

    //Question- Write a program that reads a set of integers, and then print the sum of the even and odd integers.

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int evensum = 0;
//        int oddsum = 0;
//
//        for (int i = 1; i <= n; i++) {
//
//            if (n % 2 == 0) {
//                evensum += evensum + n;
//
//                System.out.println(n + evensum);
//                break;
//            }
//            else {
//                oddsum += n;
//                System.out.println(n + oddsum);
//                break;
//
//
//            }
//        }
//
//    }

    //Question -Write a program to find the factorial of any numbers entered by user

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int factorial=1;


        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
}

