package com.JavaProject.arrays;

public class largestNumber {


    public static int oneOfLargestNumber(int number[]) {
        int largest = Integer.MIN_VALUE;//- infinity
        int smallest=Integer.MAX_VALUE;// + infinity

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            } if (smallest>number[i]) {
                smallest=number[i];
            }
        }
        System.out.println(smallest);
// we can only return one value,so printing one of them that is largest
        return largest;

    }


    public static void main(String[] args) {
        int numbers[] = {1, 6, 4, 4, 5, 77, 7};
        int biggest = oneOfLargestNumber(numbers);
        System.out.println(biggest);
        System.out.println("this is harry");

    }

}
