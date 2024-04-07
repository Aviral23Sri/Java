package OOPS;

public class StaticKeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.Schoolname ="avi";
        System.out.println(s1.Schoolname);
    }
    
}
class Student {
    String name ;
    int roll;
    static String Schoolname; 
    void setname(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

 }