public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eats();

    }
}

class Animal {               // Base Cass
    String skincolor;

    void eats(){
        System.out.println("eats");
    }
    void breath() {
        System.out.println("breths");
    }
}

class Fish extends Animal {        // Derived class
    String swim;

}