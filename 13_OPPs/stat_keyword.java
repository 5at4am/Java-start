/*
 * File: StatKeyword.java
 * Description: This program demonstrates the use of static keyword in Java.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use static variables to share data across all instances of a class
 * - Understand the difference between instance and static variables
 * - See how static variables are shared among all objects
 * - Implement getter and setter methods for object properties
 * 
 * Key concepts:
 * - Static variables: Belong to the class, not to any specific instance
 * - All objects of the class share the same static variable
 * - Changing static variable in one object affects all other objects
 * - Static variables are initialized when the class is first loaded
 * - Non-static (instance) variables are unique to each object
 */
public class stat_keyword {
    public static void main(String[] args) {
        student s1 = new student();
        s1.schoolname = "st";
        student s2 = new student();
        System.out.println(s2.schoolname);
        s2.schoolname = "sm";
        student s3 = new student();
        s3.schoolname = "bvn";
        System.out.println(s2.schoolname);

    }

}

class student {
    String name;
    int roll;

    static String schoolname;

    void setname(String name) {
        this.name = name;
    }

    String getname(String name) {
        return this.name;
    }

    void setroll(int roll) {
        this.roll = roll;
    }

    int getroll(int roll) {
        return this.roll;
    }
}
// Static keyword: When data should be shared across all instances!
// Fun fact: Static variables belong to the class, not to individual objects!
