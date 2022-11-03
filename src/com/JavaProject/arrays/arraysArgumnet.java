package com.JavaProject.arrays;

public class arraysArgumnet {

    public static void update(int marks[]) {

        // creating method to add 1 to all arrays

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[1] + 1;
        }
    }
    public static void main(String[] args) {

// arrays pass by reference not by value
        //methods pass by value

        int marks[] = {97, 78, 98};
        update(marks);
// doing for loop to check new values in array instead og checking the one by one
        //print marks
        for(int i=0;i< marks.length;i++){
            System.out.print(marks[i] + " ");
        }
    }
}
