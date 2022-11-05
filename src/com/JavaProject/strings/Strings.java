package com.JavaProject.strings;

import java.util.Scanner;

public class Strings  {

    //public class Strings -we made this class

    public static void main(String[] args) {

        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        // String-this is inbuilt class

        String str2 = new String("harry");

        //Strings are immutable, means once they are created,we cannot break them

        //let's take string as input and out put



// PRINT WHOLE LINE



        Scanner sc = new Scanner(System.in);
        String name;
        // name=sc.next(); prints only first words
        //name=sc.nextLine();//prints whole line.
        name = sc.nextLine();
        // showing example to print string with scanner class
        System.out.println(name);



        //STRINGS LENGTH



        String fullName = "harkamal";

        System.out.println(fullName.length());

        // .length
        // .length() is a function in String
        // .length is a property in array.



//CONCATENATION

        // joining two strings is called concatenation

String firstname= "harry";
String lastname = "gill";

String completeName = firstname + " " +  lastname;
        System.out.println(completeName);

    }


}
