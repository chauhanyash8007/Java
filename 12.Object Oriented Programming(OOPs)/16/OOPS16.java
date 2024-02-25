// interfaces 

public class OOPS16 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Bear b = new Bear();
        b.eat();
        b.eats();

    }
}

// multiple inheritance using interfaces
interface Herbivore { // class a
    void eat();

}

interface Carnivore { // class b
    void eats();

}

class Bear implements Herbivore, Carnivore { // class a+b called multiple inheritance
    public void eat() {
        System.out.println("eats grass");
    }

    public void eats() {
        System.out.println("don't eats grass");
    }
}

interface ChessPlayer {
    void moves();
    // by default it is public and abstract without implementation

}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal in all 4 direction ");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal by 1 step ");
    }
}
