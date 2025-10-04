/*
 * File: NEWS.java
 * Description: This program calculates the shortest distance from origin based on movement directions.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Parse a string of movement directions (N, S, E, W)
 * - Track coordinates based on movement commands
 * - Calculate Euclidean distance from origin
 * - Use Math.sqrt() for distance calculation
 * - Properly close Scanner resources
 * 
 * Movement mapping:
 * - N: Move North (y increases)
 * - S: Move South (y decreases)  
 * - E: Move East (x increases)
 * - W: Move West (x decreases)
 * 
 * Distance formula: sqrt(x² + y²)
 */
import java.util.*;

public class NEWS 
{
    public static float getshort(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir =='S'){
                y--;
            }else if(dir =='N'){
                y++;
            }else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements : ");
        String path ="WNEENESENNN";

        System.out.println(getshort(path));
        sc.close();
    }
}
// Path calculation: When directions become coordinates!
// Fun fact: This is a simple vector addition problem in disguise!