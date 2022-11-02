package com.JavaProject.method_find;


//binomial coeffeicent
public class binomialcoefficient {
    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }

        return f;
    }

    public static int bincoeff( int n, int r) {

        int fact_n = factorial(n);
        int fact_f = factorial(r);
        int minfandr = factorial(n - r);

        int bincoeff = fact_n / (fact_f * minfandr);
        return bincoeff;
    }



    public static void main(String[] args) {
        System.out.println(bincoeff(5,2));

    }
}
