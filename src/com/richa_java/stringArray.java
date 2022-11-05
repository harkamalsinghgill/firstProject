package com.richa_java;

import java.util.Random;

public class stringArray {

    // import java.util.random
    // Random r = new Random();



    public static void main(String[] args) {



        String [] arr= new String [3];
        arr[0]="richa";
        arr[1]="harry";
        arr[2]="luthra";


        String [] arr1= {"milan", " gill", "richa", "luthtra"};


        Random r =new Random();
        int marks []= new int[10];

        for(int i=0;i<=10;i++){
            marks[i]=r.nextInt(10);
            System.out.println(marks[i]);
        }




for( int i=0;i<3;i++) {
    System.out.println(arr[i]);
    System.out.println(arr1[i]);
        }

    }
}
