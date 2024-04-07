package OOPS;

public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student("Aviral");                  // constructs are invoked automatically at the time of object creation
        System.out.println(s1.name);

    }
}

class Student {
    String name ;
    int roll;
    Student(String name){
        //contructor
        this.name = name;
    }
}
