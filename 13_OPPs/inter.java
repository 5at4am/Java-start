public class inter {
    public static void main(String[] args) {
        
        // Method Overriding
        queen q = new queen();
        q.moves();
        q.kill();
        
        rook r = new rook();
        r.moves();
        r.kill();
        
        king k = new king();
        k.moves();
        k.kill();
    }
}

interface chessplayer {
    void moves();
    void kill();
}

class queen implements chessplayer {
    public void moves() {
        System.out.println("queen moves in all direction");
    }
    public void kill() {
        System.out.println("queen can kill in all direction");
    }
}

class rook implements chessplayer {
    public void moves() {
        System.out.println("rook moves in straight direction");
    }
    public void kill() {
        System.out.println("rook can kill in straight direction");
    }
}

class king implements chessplayer {
    public void moves() {
        System.out.println("king moves in all direction but only one step");
    }
    public void kill() {
        System.out.println("king can kill in all direction but only one step");
    }
}