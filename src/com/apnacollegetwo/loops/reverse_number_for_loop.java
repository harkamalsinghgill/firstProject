package com.apnacollegetwo.loops;

public class reverse_number_for_loop {
    public static void main(String[] args) {

        //print revers of 10899

        for(int i=10899;i>0;){
            int lastdigit =i%10;
            // when we modulo number with 10, it takes last number
            // so in this case it will take last number and print it
            System.out.print(lastdigit + " ");
            i=i/10;
            // when we divide number, it will remove number
            //so in this case,10899%10, leaves with 9 and it gets printed,
            //and when 10899/10, last number gets removed and 1089%10 gives 8 and
            // it get printed too

        }
    }

}
