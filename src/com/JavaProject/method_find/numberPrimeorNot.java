package com.JavaProject.method_find;

public class numberPrimeorNot {

    /*n is prime if it get divide ony by 1 or itself(n)
   for(int i=2 to i=n-i)
   if n%i==0, then it is not a prime number otherwise it is a prime number


     */
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {//completely dividing
                isPrime = false;

            }

        }return isPrime;

    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));

    }
}
