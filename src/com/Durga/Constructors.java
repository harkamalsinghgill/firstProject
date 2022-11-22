package com.Durga;

public class Constructors {

    String name;
    int rollno;

    Constructors(){

        super();

        System.out.println("Constructor");
    }

    Constructors( String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }




    public static void main(String[] args) {
        Constructors s1= new Constructors("Durga", 101);
        Constructors s2= new Constructors( "Ravi", 102);

        System.out.println(s1.name+ "  "+ s1.rollno);
        System.out.println(s2.name+ "   "+ s2.rollno);


        Constructors s3=new Constructors();
        Constructors s4 = new Constructors();




    }
}
