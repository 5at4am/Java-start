/*
 * File: Tiling.java
 * Description: This program calculates the number of ways to tile a 2×n board using 2×1 tiles.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Solve the classic tiling problem using recursion
 * - Understand that each tile can be placed in two orientations (vertical or horizontal)
 * - Use dynamic thinking: each solution builds on smaller subproblems
 * - See how this relates to Fibonacci sequence
 * 
 * Algorithm:
 * - For a 2×n board, we can place the first tile in two ways:
 *   1. Vertical tile (covering 2×1 area) → leaves 2×(n-1) area → tile(n-1) ways
 *   2. Two horizontal tiles stacked (covering 2×2 area) → leaves 2×(n-2) area → tile(n-2) ways
 * - Total ways = tile(n-1) + tile(n-2)
 * - Base cases: n=0 → 1 way (empty), n=1 → 1 way (one vertical tile)
 * 
 * This follows the Fibonacci sequence: 1, 1, 2, 3, 5, 8, ...
 */
public class tiling {

    public static int tile(int n) { // 2*n floor
        if (n == 0 || n == 1) {
            return 1;
        }

        // for vertical tile
        int ver = tile(n - 1);

        // for horizontal tile
        int hor = tile(n - 2);

        // total ways
        int total = ver + hor;
        return total;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tile(n));

    }

}
// Tiling problem: How many ways to fill a 2×n board with 2×1 tiles?
// Fun fact: This is mathematically equivalent to the Fibonacci sequence!
