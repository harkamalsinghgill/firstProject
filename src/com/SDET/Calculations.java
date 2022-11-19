package com.SDET;

public class Calculations {


    int a;
    int b;


    //method not taking parameters-empty parameters
/*
    void sum(){
        System.out.println((a+b));
    }
  */


    //method takes parameters

   /* void sum( int x, int y){
        System.out.println(x+y);
    }
*/


    //method returns some value

    int sum(){

        return(a+b);
    }

    public static void main(String[] args) {

       /*  Calculations cal1 = new Calculations();
        cal1.a=5;
        cal1.b=4;
        cal1.sum();
        */


      /*  Calculations cal2 = new Calculations();
        cal2.sum(5,4);
*/

        Calculations cal3= new Calculations();
        cal3.a=4;
        cal3.b=5;
      int r=   cal3.sum();
        System.out.println(r);

    }
}
