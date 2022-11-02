package com.JavaProject.arrays;

public class Arrays_one {
    public static void main(String[] args) {

        //to get percentage

        int numbers[]= new int[3];
        numbers[1]=2;
        numbers[0]=7;
        numbers[2]=5;

        int percentage = ( numbers[0] + numbers[1] + numbers[2]/3);
        System.out.println("percentage = " + percentage + "%" );



    }
}
