package com.richa_java;

import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {


        // diff between while loop and do while loop?

        int thoughtNo = (int) (Math.random()*100);

        System.out.println("let's play the guessing game");
        System.out.println(" I have thought a number.. try guessing again");

        Scanner sc = new Scanner(System.in);

        int guessedNo;

        do{
            System.out.println("guess your number");
            guessedNo=sc.nextInt();

        }while(thoughtNo!=guessedNo);
        System.out.println("you win..guessed you are right");


    }
}