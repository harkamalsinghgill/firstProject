package com.JavaProject.loops;

import java.util.Scanner;

public class sum_of_first_n_numbers_while_loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum=0;

        while( i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);



    }
}
