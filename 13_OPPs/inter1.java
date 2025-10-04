public class inter1 {
    public static void main(String[] args) {
        bear b = new bear();
        b.eatplant();
        b.eatmeat();
        
    }
}

interface herbibore{
    void eatplant();
}
interface carnivore{
    void eatmeat();
}

class bear implements herbibore,carnivore{
    public void eatplant(){
        System.out.println("bear eat plants");
    }
    public void eatmeat(){
        System.out.println("bear eat meat");
    }
}
