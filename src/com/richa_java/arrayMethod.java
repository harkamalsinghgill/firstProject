package com.richa_java;

import java.util.Random;

public class arrayMethod {



    public static void initializeArray(int [] marks){
        Random r=new Random();
        for(int i=0;i<marks.length;i++){
            System.out.println(r.nextInt());
        }
    }

    public static void main(String[] args) {

        int [] marks = new int [10];
        initializeArray(marks);


    }
}
