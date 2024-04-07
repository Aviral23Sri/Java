public class Function_Overriding {
    public static void main(String args[]){
        deer d1 = new deer();
        d1.eats();
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

class deer extends Animal {
    void eats(){
        System.out.println("Eats grass");
    }
}
