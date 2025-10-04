/*
 * File: Q1.java
 * Description: This program demonstrates various operator usage and behavior in Java.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Understand order of operations with arithmetic operators
 * - Work with compound assignment operators
 * - Use logical operators in conditional statements
 * - Practice complex expression evaluation
 * - Understand integer division behavior
 * 
 * Multiple exercises included:
 * - Exercise 1: Arithmetic expression evaluation
 * - Exercise 2: Logical operator usage with conditional statements
 * - Exercise 3: Compound assignment operators
 * - Exercise 4: Complex expression with multiple operators
 * - Exercise 5: Division and multiplication precedence
 */
package operators.questions;

public class Q1 {
    public static void main(String[] args) {
        // Question 1
        int x= 2,y=5;
        int exp1 = (x*y/x);
        int exp2 = (x*(y/x));
        System.out.println(exp1+","+exp2);

        //Question 2
        int a = 200,b=50,c=100;
        if(a>b && b>c ){
            System.out.println("hello");

        }
        if (a>b&&c>b) {
            System.out.println("world");
        }
        if((a+200) <x && (b+150)<c){
            System.out.println("java");
        }

        //Question 3

        int p ,q,r;
        p=q=r=2;
        p+=q;
        q-=r;
        r /=(p+q);
        System.out.println(p+"\t"+q+"\t"+r);

        //Question 4

        int i =9, j=12;
        int k =2, l=4,m=6;
        int exp = 4/3*(i+34)+9*(k+l*m)+(3+j*(2+k))/(k+l*j);
        System.out.println(exp);

        //Question 5
        int e =10,f=5;
        int exp3 = (f*(e/f+e/f));
        int exp4 =(f*e/f+f*e/f);
        System.out.println(exp3+"\t"+exp4);

}
}
// Operators are the verbs of programming - they perform actions on data!
// Fun fact: Operator precedence can significantly affect the result of expressions!
