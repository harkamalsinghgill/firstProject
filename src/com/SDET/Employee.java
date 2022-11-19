package com.SDET;

public class Employee {

    // class is a collection of variables and methods

    int empid;
    String empname;
    int salary;
    int deptno;


    //Create method with same name as class,called Constructor

    //Accessing variables through constructor
    /* Employee( int id, String name, int sal, int dno){
        empid=id;
        empname=name;
        salary=sal;
        deptno=dno; */
    // }

    //creating method to access variables through main method

    void setdada( int id, String name, int sal, int dno){
        empid=id;
        empname=name;
        salary=sal;
        deptno=dno;

    }

    void display(){
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(salary);
        System.out.println(deptno);

    }

//we create main method, because execution always starts from main method
    public static void main(String[] args) {

       /*  Employee emp1 = new Employee();

        // we will have access to variables and methods through this object
        emp1.empid= 101;
        emp1.empname="Harry";
        emp1.salary=20000;
        emp1.deptno=1;

        // to print, access display method

        emp1.display();

        Employee emp2 = new Employee();

        emp2.empid=102;
        emp2.empname="appu";
        emp2.salary=30000;
        emp2.deptno=2;

        emp2.display();

//How many ways we can initialize values to class variables
        /* 1. Using object (directly)
        2. Using Constructor
        3. Using methods */


//2. Constructor is a kind of method, but the constructor name should be samea sa name of class

//Assigning values using Constructor

       /*  Employee emp3 = new Employee(103,"Milan",40000,3);
        emp3.display();

        Employee emp4 = new Employee(104,"Gill", 50000, 105);
        emp4.display(); */


//Using methods



        //Assigning Values using methods

        // To call method, we need to create Object

       /*  Employee emp4 = new Employee();
        emp4.setdada(105,"Singh",60000, 3);
        emp4.display();

        Employee emp5 = new Employee();
        emp4.setdada(106,"Batra", 70000, 4);
        emp5.display();
        */


        /* Methods
        1. A Method takes parameters
        2. A Method may not take parameters
        3. A Method returns some value
        4. A Method may not return any value
         */



    }
}
