package com.JavaProject.loops;

import java.util.Scanner;

public class whileLoop {
    /*
    while(condition){
    do something
    }
     */
    // print numbers from 1 to 10
    public static void main(String[] args) {
//        int n = 0;
//       while(n<=10){
//            System.out.println(n);
//            n++;
//
//       }


        // Print numbers from 0 to z
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int y = 0;
        while (y <= z) {
            System.out.println(y);
            y++;

        }

    }
}
