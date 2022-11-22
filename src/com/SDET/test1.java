package com.SDET;


class A {

    int a;
    int b;

    public void display() {
        System.out.println(a + b);
    }
}

class  B extends  A {
    int x;
    int y;



    public void show() {
        System.out.println(x + y);
    }

}


class  C extends B {
    int p;
    int q;

    public void cum(){
        System.out.println(p+q);
    }


        }


public class test1 {

    public static void main(String[] args) {

        A aobj = new A();

        aobj.a = 5;
        aobj.b = 4;
        aobj.display();


        B bobj= new B();
        bobj.x=10;
        bobj.y=20;
        bobj.show();

        bobj.a=100;
        bobj.b=150;
        bobj.display();

        C cobj=new C();
        cobj.a=2;
        cobj.b=3;
        cobj.p=4;
        cobj.q=5;
        cobj.x=6;
        cobj.y=7;
        cobj.show();
        cobj.display();
        cobj.cum();


    }


}
