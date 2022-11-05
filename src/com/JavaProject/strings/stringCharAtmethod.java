package com.JavaProject.strings;

public class stringCharAtmethod {

// charAt is used to print each word of string

    // go to main method first, then second method

    public static void typeEachWord(String str) {

        for (int i = 0; i < str.length(); i++) {
            // creating for loop to get each word from String
            System.out.print(str.charAt(i) + " ");
        }
    }


    public static void main(String[] args) {
        String firstname = "harry";
        String secondName = "Singh";
        String fullName = firstname + " " + secondName;//called concatenation
// let's create method to print each word from string
        //we create method to use this function when ever we need it

        //command method to print each word from String
        typeEachWord(fullName);


    }

}
