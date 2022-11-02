package com.richa_java;
import java.util.Scanner;




public class while_loop_game {

    public static void main(String[] args) {

        int thoughtNo = (int)(Math.random());

        System.out.println("let's play the guessing game");
        System.out.println(" I have thought a number.. try guessing again");

        Scanner sc= new Scanner(System.in);

        int guessedNo=sc.nextInt();

        while (thoughtNo!=guessedNo){
            System.out.println("your guess was wrong,,try again");
            guessedNo = sc.nextInt();

        }
        System.out.println("you win...guessed right");
    }
}
