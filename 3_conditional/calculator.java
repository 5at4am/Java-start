import java.util.*;
public class calculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    
    System.out.print("\nEnter the second number: ");
    int num2 = sc.nextInt();
    
    System.out.println("\nchosse the operator \n 1. + \n 2. -\n 3. * \n 4. / \n 5. % ");
    
    System.out.print("\ninter the opertaor :");
    char op = sc.next().charAt(0);
    
    int result = 0;
    
    switch (op) {
        case '+':
        result = num1 + num2;
        System.out.println(result);    
        break;
    
        case '-':
        result = num1 - num2;
        System.out.println(result);
        break;
    
        case '*':
        result = num1 * num2;
        System.out.println(result);
        break;
    
        case '/':
        result = num1/num2;
        System.out.println(result);
        break;
    
        case '%':
        result = num1%num2;
        System.out.println(result);
        break;
    
        default:
        System.out.println("enter the number given above");
    }
    sc.close();
    }   
}
