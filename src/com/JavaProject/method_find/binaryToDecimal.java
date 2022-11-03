package com.JavaProject.method_find;

public class binaryToDecimal {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            //math.pow is used to get power of any number
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal of " +myNum + " = "+ decNum);
    }

    public static void main(String[] args) {
        binToDec(10);
    }
}
