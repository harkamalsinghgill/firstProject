package com.richa_java;

public class fibonacci {

    public static void main(String[] args) {
        int n=10;
        int firstterm=0;
        int secondterm=1;
        for(int i=1;i<=n;i++){
            System.out.println(firstterm);
            int nexterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=nexterm;

        }
    }
}
