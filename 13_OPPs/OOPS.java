/*
 * File: OOPS.java
 * Description: This program demonstrates basic OOP concepts including encapsulation and class design.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create classes with attributes and methods
 * - Use setter methods to modify object properties
 * - Understand object instantiation and property access
 * - Demonstrate the concept of encapsulation (though not fully implemented)
 * - Show public vs private access considerations
 * 
 * Key concepts:
 * - Class: Blueprint for creating objects (Pen, bank)
 * - Object: Instance of a class (p1, myacc)
 * - Attributes: Properties of the class (color, tip, username)
 * - Methods: Behaviors of the class (setcolor, setTip, setpwd)
 * - Encapsulation: Data hiding (though incomplete in this example)
 * 
 * Note: The bank class could be improved by making username private and adding proper getter/setter methods.
 */
public class OOPS {
    public static void main(String[] args) {

        Pen p1 = new Pen();

        p1.setcolor("Red");
        p1.setTip(10);

        System.out.println(p1.color);
        System.out.println(p1.tip);

        p1.color = "Blue";
        p1.tip = 20;

        System.out.println(p1.color);
        System.out.println(p1.tip);

        bank myacc = new bank();
        myacc.username = "Satyam";
        myacc.setpwd("1234");

    }

}

class Pen {

    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newtip) {
        tip = newtip;
    }

}

class bank {
    public String username;

    public void setpwd(String pwd) {
    }
}
// Basic OOP: Classes, objects, and methods in Java!
// Fun fact: This example shows the need for proper encapsulation in the bank class!