import java.util.*;
public class prime {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter the prime no. : ");
         int n = sc.nextInt();
         if(n==2){
            System.out.println("is not a prime");
         }else{
            boolean isprime = true;  //assume number is prime
         for (int i = 2; i <= n -1; i++) { //loop 2 to n-1
            if(n%i==0){     // n is multiple of i (i not equal to 1 or n)
                isprime = false;    
            }
         }
         if(isprime==true){
            System.out.println("is prime");
         }else{
            System.out.println("is not prime");
         }

         }
         
         sc.close();
    }
}
