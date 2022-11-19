package com.JavaProject.arrays;

import java.util.Scanner;

public class towDDarray {


    public static boolean Search(int matrix[][], int key ) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == key) {
                    System.out.println("found at cell" + " " +i + " " + j);
                }

            }
        }                return false;

    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        //int n = matrix.length, m = matrix[0].length;
        //cells = rows (n) * columns (m)
        Scanner sc = new Scanner(System.in);

        //input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
Search(matrix,5);
    }





}
