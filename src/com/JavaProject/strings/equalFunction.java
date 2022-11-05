package com.JavaProject.strings;

public class equalFunction {

    //in Strings, we use (.equal) function to check if strings are equal or not


    public static void main(String[] args) {
         String s1 = "harry";
         String s2= "harry";
         String s3= new String("harry");

         if(s1.equals(s3)){
             System.out.println("the are equal");
         }
         else{
             System.out.println( "they are not equal");
         }


    }
}
