package com.JavaProject.oops;

public class OOPS {

    public static void main(String[] args) {

        Pen p1 = new Pen();// created a pen object called p1
        p1.setColor("Blue");//change color by calling method from object
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}
class Pen{
    String colour;
    int tip;

    void setColor( String setColor){
        colour = setColor;
    }

    void setTip( int newTip){

        tip = newTip;
    }
}





