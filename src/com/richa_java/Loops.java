package com.richa_java;

public class Loops {


    public static void main(String[] args) {
//        //hello
//        //hello 10 times
//        //hello 5 times in each line with total 5 rows
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("hello");
//            }
//            System.out.println();
//        }


        // 1 1 1 1
        // 2 2 2 2
//        // 3 3 3 3
//        // 4 4 4 4
//        // 5 5 5 5
//        for (int i =1; i < 10; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.print(i + " ");
//
//            }
//            System.out.println();
//
//        }
        /*
        * row 1
        * * row 2
        * * * row 3
        * * * * row 4
         */
        //follow the  pattern

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( j +" ");


            }
            System.out.println();
        }
    }
}
