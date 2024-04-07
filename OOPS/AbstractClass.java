package OOPS;

public class AbstractClass {
    public static void main(String args[]){
        horse h = new horse();
        h.walks();
        h.eats();;
        chicken c = new chicken();
        c.walks();
        c.eats();
    }

    abstract class Animal{
        void eats(){
            System.out.println("Animal Eats");
        }
        abstract void walks();
    }
}
abstract class Animal{
    void eats(){
        System.out.println("Animal Eats");
    }
    abstract void walks();
}

class horse extends Animal{
    void walks(){
        System.out.println("Walks on 4 legs");
    }
}

class chicken extends Animal{
    void walks(){
        System.out.println("Walks on 2 legs");
    }
}
