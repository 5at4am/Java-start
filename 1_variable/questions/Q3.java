// This program calculates the total cost of three items, including GST.
import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the prize of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("enter the prize of pen : ");
        float pen = sc.nextFloat();
        System.out.print("enter the prize of eraser : ");
        float eraser = sc.nextFloat();
        float cost = pencil + pen + eraser;
        System.out.println("total cost of stationery is : " + cost);
        float gst = cost * 0.18f;
        System.out.println("gst is : " + gst);
        float total_cost = cost + gst;
        System.out.println("total cost after gst is : " + total_cost);
        sc.close();
    }
}
// The only things certain in life are death and taxes. And maybe bugs.