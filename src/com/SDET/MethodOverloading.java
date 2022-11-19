package com.SDET;

public class MethodOverloading {


    int a;
    int b;

    void sum() {  //first method
        a = 10;
        b = 20;
        System.out.println(a + b);

    }

    void sum(int x, int y) { //second method
        int a = x;
        int b = y;
        System.out.println(a + b);
    }

    void sum(int x, int y, int z) { //third method
        System.out.println(x + y + x);
    }

    void sum(int x, double y) {  //fourth method
        System.out.println(x + y);
    }

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();

        mo.sum(); //  calls first method

        mo.sum(100, 200); //calls second method, as it matches criteria

        mo.sum(100, 200, 300); //calls third method

        mo.sum(10,10.5); //calls fourth method

    }

}
