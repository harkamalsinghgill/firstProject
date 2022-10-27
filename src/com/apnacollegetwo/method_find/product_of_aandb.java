package com.apnacollegetwo.method_find;

import java.util.Scanner;

public class product_of_aandb {

    public static int Product(int x, int y) {
        int Product = x * y;
        return Product;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multipy =Product(a,b);
        System.out.println(multipy);


    }
}

//    public static class callsByValue {
//
//        //swap-values exchange
//     public static void Swap(int x, int y){
//         int temp =x;
//         x = y;
//         y = temp;
//         System.out.println("Value of new a : " + x);
//         System.out.println("Value of new b : " + y);
//    // not using int because we are not returning anything here, we are just printing it
//     // all changes happen stay here, they don't go to other class
//     }
//        public static void main(String[] args) {
//            int a =4;
//            int b =5;
//            Swap(a,b);
//
//            // swap values
//           // Java always calls by value not call by Reference
//           // call by value means copy of a and b goes to x and y not original values goes there


