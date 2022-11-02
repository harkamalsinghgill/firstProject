package com.richa_java;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number from 1 - 12 ");
        int month = sc.nextInt();

        //exercise-linear, horizontal,logical,and this approach

//         if(month==1|| month==3 || month==5||month==7||month==9||month==12){
//
//             System.out.println("31 days");
//         } else if (month==2||month==4||month==6||month==8||month==10||month==12) {
//             System.out.println("print 30 ");
//
//         }
//         else{
//             System.out.println("garbage");
//         }


        switch (month) {
            //any type greater than long number cannot go to switch
             //  switch directly jump to particular number
            // so, we write break to avoid checking next numbers
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("30 days");
                break;
            case 3:
                System.out.println("29 days");
                break;
            case 4:
                System.out.println("28 days");
                break;
            default:
                System.out.println("garbage");
        }
    }
}
