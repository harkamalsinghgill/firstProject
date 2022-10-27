package com.apnacollegetwo.arrays;

public class arrays_lenght {
    public static void update(int marks[]){

        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i] +1;
        }
    }

    public static void main(String[] args) {
//
//        int length []= new int[50];
//        System.out.println(length.length);
//
//        // to get legth do sout(type.lenght)
//
//        // arrays go by refrence

        int marks [] = {89,98,80};
        update(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");
        }


    }
}
