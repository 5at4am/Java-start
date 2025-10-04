/*
 * File: Q2.java
 * Description: This program determines if a person has a fever based on their temperature.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use a hardcoded temperature value for demonstration
 * - Implement conditional logic to check for fever
 * - Compare double values using comparison operators
 * - Output appropriate health status based on the condition
 * 
 * Logic implemented:
 * - If temperature > 100: Print "Fever"
 * - Otherwise: Print "No Fever"
 * 
 * Note: Temperature is hardcoded as 103.5 for demonstration purposes.
 */
package questions;

public class Q2 {
    public static void main(String[] args) {
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("Fever");

        } else {
            System.out.println("No Fever");
        }
    }
}
// Health check: When your temperature rises above 100°F, it's time to rest!
// Fun fact: Normal human body temperature is around 98.6°F (37°C)!
