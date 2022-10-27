package com.youtube_harry;
 import java.util.Scanner;

public class methods {
// methods using if,else
     static int logic(int x, int y){
        int z;
        if (x>y){
            z=(x+y)*5;
        }
        else {
            z= (x-y)*10;

        }
        return z;
    }

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int z = logic(a,b);
        System.out.println(z);

    }
}

