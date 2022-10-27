package com.apnacollegetwo.loops;

public class revers_the_gives_number {
    public static void main(String[] args) {
        // revers the given number
        int rev=0;

        for(int n=10899;n>0;){

            int lastdigit=n%10;
            rev=(rev *10) + lastdigit;
            n=n/10;


        }
        System.out.println(rev);

    }
}
