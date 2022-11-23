package com.SDET;

class Bank {

    int rateofinterest() {
        return 10;
    }
}

    class ICIC extends Bank {

        int rateofinterest() {
            return 11;

        }

    }


   abstract class harry {

     //  abstract int h1();

     //  abstract int h2();
   }


     abstract   class appu extends harry {
          // @Override
           int h1() {
               return 1;

           }


       }

       class Batra extends appu {
        //   @Override
           int h2() {
              return 2;

           }
       }




 class AXIS extends Bank {
        int rateofinterest() {
            return 12;

        }

     // public abstract String gettest();
    }

    class SBI extends Bank {
        int rateofinterest() {
            return 13;

        }
    }



public class overriding {


    public static void main(String[] args) {

        ICIC ic = new ICIC();
        System.out.println(ic.rateofinterest());

        AXIS ax=new AXIS();
        System.out.println(ax.rateofinterest());

        SBI sb=new SBI();
        System.out.println(sb.rateofinterest());
//
//        appu ap=new appu();
//        ap.h1();
//      //  ap.h2();
Batra ap=new Batra();
ap.h2();
ap.h1();
        System.out.println(ap.h1());
        System.out.println(ap.h2());


    }
}





