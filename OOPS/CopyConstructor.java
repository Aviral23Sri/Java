package OOPS;
import java.util.*;

public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Aviral";
        s1.roll = 36;
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);

    }
}

class Student {
    String name;
    int roll;
    
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;

    }
    Student(){

    }
}