package com.JavaProject.oops;

public class gettersAndSetters {
    /*
    Get function : to return the value
    Set function  : to modify the value
    this: this keyword is used to refer to current object
     */

    public static void main(String[] args) {

        Brick p1 = new Brick();// created a pen object called p1
        p1.setColor("Blue");//change color by calling method from object
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
class Brick{
  private String color;
    private int tip;

   String getcolor(){

        return this.color;
    }

    int getTip(){
        return this.tip;
    }


    void setColor( String color){
        this.color = color;
    }

    void setTip( int tip){

        this.tip = tip;
        //this is used when variables have same names
    }
}




