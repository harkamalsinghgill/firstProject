package com.JavaProject.strings;

public class stringBuilder  {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(" ");

        for(char ch='a';ch<='z';ch++){
            sb.append( ch + " ");
            // .append is used to add words at the end of string.
        }
        System.out.println(sb);

    }



}
