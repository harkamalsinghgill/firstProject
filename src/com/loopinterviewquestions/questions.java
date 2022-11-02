package com.loopinterviewquestions;
import java.util.Scanner;

public class questions {
    /*
    //Write a method that uses a for loop to display numbers
    // in descending order in the step of 5 starting from 100.
    Call your method from the main method.
    */
public static void descendingfive( int n){

    for(int i=n;i>0;i-=5){
        System.out.println(i);
    }
}

    public static void main(String[] args) {
descendingfive(100);

    }
}
