package com.JavaProject.oops;

public class accessModifier {

    public static void main(String[] args) {

        Pen p1 = new Pen();// created a pen object called p1
        p1.setColor("Blue");//change color by calling method from object
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

 class Penn{
    String color;
    int tip;

    void setColor( String setColor){
        color = setColor;
    }

    void setTip( int newTip){

        tip = newTip;
    }
}

class BankAccount {

    public String password;

}

