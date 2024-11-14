import java.util.*;
public class tax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;

        if (income<500000){
            System.out.println("You are exempted from tax");
            tax =0;

        }else if(income>=500000 && income<=1000000){
            tax =  (int) (income * 0.2);
            System.out.println("Your tax is: "+tax);
            System.out.println("your actual income in hand is "+ (income-tax));

        }else{
            tax = (int) (income * 0.3);
            System.out.println("Your tax is: "+tax);
            System.out.println("your actual income in hand is "+ (income-tax));
        }
        sc.close();
    }
}
