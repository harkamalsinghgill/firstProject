package com.SDET;


import com.sun.org.apache.bcel.internal.Const;

public class ConstructorOverloading {

    int a = 0;
    int b = 0;
    double c = 0;

    ConstructorOverloading() { // first
        a = 10;
        b = 20;
        c = 20.5;

    }


    ConstructorOverloading(int x, int y){ //second
        a=x;
        b=y;


    }

    ConstructorOverloading( int x, double y){ //third
        a=x;
        c=y;
    }

    ConstructorOverloading(int x, int y, double z){ //fourth
        a=x;
        b=y;
        c=z;
    }

    ConstructorOverloading( int x, double y, int z){ // fifth
        a=x;
        b=z;
        c=y;

    }

    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {

       // ConstructorOverloading co= new ConstructorOverloading(); //call fist Constructor

        // co.display();

        // ConstructorOverloading co =new ConstructorOverloading(10,20); //second Constructor
        // co.display();

        // ConstructorOverloading co =new ConstructorOverloading(10,10.5); //third Constructor

        // co.display();

        //ConstructorOverloading co= new ConstructorOverloading(10,20,20.5); //fourth Constructor
        //co.display();

        ConstructorOverloading co =new ConstructorOverloading(10,10.5,29); //fifth constructor
        co.display();



    }


}
