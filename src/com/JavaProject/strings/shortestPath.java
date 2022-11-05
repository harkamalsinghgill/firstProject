package com.JavaProject.strings;

public class shortestPath {

    public static float getShortestpath(String directions) {
        //float method created just in case is in points
        //rest follow on apnacollege
        //I am hungry

        int x = 0, y = 0;

        for (int i = 0; i < directions.length(); i++) {
            char dir = directions.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }


        }
        int X = x * x;
        int Y = y * y;
        return (float) Math.sqrt(X + Y);
    }


    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        System.out.println(getShortestpath(directions));


    }


}
