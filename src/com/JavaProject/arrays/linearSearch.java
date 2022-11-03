package com.JavaProject.arrays;

public class linearSearch {
    //searching for something continuously,called linear search.
    //if key matches number in index

    public static int linearsearch(int marks[], int key) {

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key)// if any of numbers in index are == key ,
                // we will return that number {
                return i;
            }

        return -1;
    // if key doesn't exist we will return -1

    }

    public static void main(String[] args) {

        int marks[] = {56, 5646, 478, 325, 25, 3, 3, 3};
        int key = 25;
        // create a method to check key matches or no
        int update = linearsearch(marks, key);

        if (update == -1) {
            System.out.println("no");
        } else {
            System.out.println(key);
        }

    }


}



