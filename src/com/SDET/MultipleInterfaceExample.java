package com.SDET;

interface D {

    int a = 1;

    void show();
}

interface E {
    int b = 2;

    void display();
}


public class MultipleInterfaceExample implements D, E {

    @Override
    public void show() {
        System.out.println(a);
    }

    public void display() {
        System.out.println(b);
    }


    public static void main(String[] args) {
        MultipleInterfaceExample met=new MultipleInterfaceExample();
        met.display();
        met.show();
    }
}