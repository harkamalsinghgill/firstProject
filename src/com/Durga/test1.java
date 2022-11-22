package com.Durga;

public class test1 {

   public class p {

       String s = "parent";

       public class c extends test1 {
           String s = "child";

           void m1() {
               System.out.println(s);
               System.out.println(this.s);

           }

       }
   }



        public static void main(String[] args) {


        }

}
