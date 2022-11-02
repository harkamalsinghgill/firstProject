package com.JavaProject.method_find;

public class primesinRange {
    public static boolean isPrime(int n) {
        boolean isPrime=true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }return true;
    }

    public static int Primesinrange(int n){
        for(int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(Primesinrange(100));
    }

}
