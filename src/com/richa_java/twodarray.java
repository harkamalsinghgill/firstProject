package com.richa_java;

import java.util.Random;

public class twodarray {




    public static void main(String[] args) {


//        int[][] arr = new int[3][5];
//        arr[0][0] = 10;
//        arr[0][1] = 78;
//        arr[0][2] = 89;
//        arr[0][3] = 89;
//        arr[0][4] = 89;
//
//
//        arr[1][0] = 56;
//        arr[1][1] = 67;
//        arr[1][2] = 67;
//        arr[1][3] = 67;
//        arr[1][4] = 67;
//
//
//        arr[2][0] = 45;
//        arr[2][1] = 56;
//        arr[2][2] = 89;
//        arr[2][3] = 89;
//        arr[2][4] = 89;
//
//
//        int array[][] = {{7, 6, 5, 6, 7}, {7, 5, 4, 4, 3}, {7, 6, 5, 4, 3}};
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i][i]);
//        }

        int marks [][] = new int[3][5];
int sum;
        Random random = new Random();

        for (int i = 0; i < marks.length; i++) {
            sum=0;

            // fill row index number i
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j]= random.nextInt(10);

                sum=sum+marks[i][j];
                // fill column index

                //System.out.print(marks[i][j] +" ");
            }
            System.out.println(sum);


        }
    }
}
