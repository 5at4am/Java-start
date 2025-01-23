package Questions;

import java.util.*;
public class lowerchar 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the character : ");
        // char ch = sc.next().charAt(0);
        // System.out.println("The lowercase of "+ch+" is "+(char)(ch|32));

        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
             //System.out.println("The lowercase of "+ch+" is "+(char)(ch|32));

             System.out.println((char) (ch|' '));   // ' '(space) is 32 in ascii
        }


        sc.close();
    }
}