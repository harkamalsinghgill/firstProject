package com.apnacollegetwo.loops;


public class break_statement_loop {

    //break is used to come out of loop, where statement is correct

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);


        }
        System.out.println("I am out of loop");
    }
}





