import java.util.*;
public class array 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        System.out.print("enter phy marks : ");
        marks[0]=sc.nextInt();
        System.out.print("enter chem marks : ");
        marks[1]=sc.nextInt();
        System.out.print("enter math marks : ");
        marks[2]=sc.nextInt();

        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage : "+percentage+"%");

        sc.close();
    }
}