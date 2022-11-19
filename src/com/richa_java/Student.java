package com.richa_java;

import java.util.Scanner;

public class Student {
    long id;
    String name;
    int grade;

    public Student() {
    }

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

void display(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(grade);
}
    public static void main(String[] args) {

        Student st = new Student();
        Student st1 = new Student(1, "harry", 56);
        Student st2 = new Student(2, "gill", 60);

        st1.display();
        st2.display();


    }
}


//    long id;
//    String name;
//    int grade;
//
//    public void study() {
//        System.out.println("I am studying...");
//
//
//    }
//
//    public void play() {
//        System.out.println("I am playing...");
//
//        Math math= new Math();
//        Student stu =new Student();
//        String str=new String("harry");
//
//        Scanner sc = new Scanner();
//    }
//}
