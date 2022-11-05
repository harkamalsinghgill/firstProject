package com.richa_java;

import java.util.Arrays;
import java.util.Scanner;

// import java.util.Arrays

//Arrays.toString


public class arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i <= 9; i++) {

            System.out.println(arr[i]=sc.nextInt());
        }

        System.out.println(Arrays.toString(arr));


    }
}
