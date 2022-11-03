package com.richa_java;

import java.util.Scanner;

public class whileloop_game {

    public static void main(String[] args) {

        int thoughtNo = (int)(Math.random()*100);

        System.out.println("let's play the guessing game");
        System.out.println(" I have thought a number.. try guessing again");

        Scanner sc= new Scanner(System.in);

        while(true){
           int guessNo=sc.nextInt();
            if(thoughtNo==guessNo){
                System.out.println("you guessed right..you win");
            }
            else{
                System.out.println("you were wrong..try guessing again");

            }
        }
    }
}
