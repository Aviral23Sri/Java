package OOPS;

public class Interfaces {
    public static void main(String srgs[]){
        Queen q = new Queen();
        q.moves();
    }
    
}


interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Moves in all four directios");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up , Down , Right , Left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("digonal and all four directions by 1 step");
    }
}

interface herbivore{
    void eats();
}
interface carbivore{
    void eats();
}
