package com.SDET;

public class Static {
    int a; //non-static

   static int b; //static

    static void m1(){

        System.out.println("this is static method");
    }

    void m2(){
        System.out.println("this is non-static method");
    }
void m3(){

        a=12;
        b=4;
        m1();
        m2();

}


    public static void main(String[] args) {

        b=100;
        m1();
        System.out.println(b);


        Static st=new Static();
        st.a=4;
        st.m2();


    }
}
