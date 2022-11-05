package com.JavaProject.strings;

public class lexicographicComparison {

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        // we use .compareTO  (function) to compare two strings
        //if first string is small, then value is negative and vice versa.
        //let's assume first string to be largest and name it largest

        String largest = fruits[0];//assumed first string is largest

        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
                // if largest.compareTo(fruits[i] is less than zero means first string is small,
                // then we print fruits[i], and we put fruits[i] to largest.

            }

        }
        System.out.println(largest);


    }

}
