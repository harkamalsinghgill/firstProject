package com.apnacollegetwo.method_find;

import java.util.Scanner;

public class syntaxWithParameters {



        /* returnType name ( type param1, type param2){
        body
        return statement;
        }
         */
        public static int calculateSum( int x, int y) { // parameters or formal parameters
            int sum = x + y;
            System.out.println(sum);
            return sum;


        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            calculateSum(a,b);


        }

    }

