package com.JavaProject.strings;

import java.lang.String;

public class Palindrome {

    public static boolean ifPalindrome(String str) {
        // created boolean to see true or false for palindrome

        // we have to check string to its half, if words match from both sides, then good otherwise no
        for (int i = 0; i < str.length() / 2; i++) {
            // we will divide string to half of it's length
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // str.charAT(n-1-i) because index value starts from zero,if we have to compare very first value to last one, we have to do n-1,
                //we are doing -i, coz after first i check it will go to second point, and frm backward it has to minus same time,so we will use -i
                //keep this doing until all numbers get match
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args) {

        //Palindrome means same from both sides of word

        String name = "noon";
        //let's create method to check it
        System.out.println(ifPalindrome(name));

    }

}

