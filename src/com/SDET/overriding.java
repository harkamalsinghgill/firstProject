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

    class AXIS extends Bank {
        int rateofinterest() {
            return 12;

        }
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


    }


}
