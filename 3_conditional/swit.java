import java.util.*;
public class swit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("number of girlfriend you want ");
        int number = sc.nextInt();
        System.out.print("\nnumber of girlfriend you got ");
        switch (number){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("'ZERO'");
        }
        sc.close();
    }
}
