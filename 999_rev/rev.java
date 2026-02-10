// ! RECURSION REVIEW FILE
// This file contains various recursion examples and implementations for practice

// ? FACTORIAL CALCULATION
// This function calculates the factorial of n (n!) using recursion
// Base case: if n is 0 then return 1
// Recursive case: n * factorial(n-1)
/*
public class rev {
    public static int num(int n) {
        if (n==0) {
            return 1;
        }
//         // int fnm1 = num(n-1);
//         int fn = n * num(n-1);
        return fn;

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(num(n));

    }
}
*/

// ? SUM OF NATURAL NUMBERS
// This function calculates the sum of first n natural numbers using recursion
// Base case: if n is 1 then return 1
// Recursive case: n + sum(n-1)
/*
public class rev {
    public static int sum (int n){
        if (n == 1) {
            return 1;
        }
        int sn = n + sum(n-1);
        return sn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));

    }
}
*/

// ? FIBONACCI NUMBER
// This function calculates the nth Fibonacci number using recursion
// Base case: if n is 0 or 1 then return n
// Recursive case: fibonacci(n-1) + fibonacci(n-2)
/*
public class rev {
    public static int fib(int n ){
        if (n==0 || n==1) {
            return n;

        }
        int fn = fib(n-1) +fib(n-2);
        return fn;

    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(fib(num));

    }
}
*/

// ? CHECK IF ARRAY IS SORTED
// This function checks if an array is sorted in ascending order using recursion
// Base case: if current element is greater than next element, return false
// Recursive case: check the rest of the array
/*
public class rev {

    public static boolean sort(int n[], int i){

        if(n[i] > n[i+1]) {
            return false;

        }

        return sort(n,i+1); 
    }

    public static void main(String[] args) {
        int n[]= {1,2,5,4,5};
        System.out.println(sort(n,0));
    }
}
*/

// ? FIND FIRST AND LAST OCCURRENCE OF KEY
// These functions find the first and last occurrence of a key in an array using recursion
// first(): returns index of first occurrence
// last(): returns index of last occurrence
/*
public class rev {

public static int first(int n[], int key,int i){

    if(n[i] == key){
        return i;
    }

    return first(n,key,i+1);
}

    public static int last(int[] n, int key, int i){
        if(i== n.length){
            return -1;
        }
        int isfound = last(n,key,i+1);
        if(isfound != -1){
            return isfound;

        }
        if(n[i]==key){
            return i;
        }

        return isfound;

    }

    public static void main(String[] args) {
        int n[]={2,5,3,8,9,2,7,9,3,0,2,6,5,5,8,9};
        System.out.println(last(n,9,0) +" : index");
    }
}
*/

// ? POWER CALCULATION (BASIC RECURSION)
// This function calculates x^n (x raised to the power n) using recursion
// Base case: if n is 0 then return n (incorrect implementation - should return 1)
// Recursive case: x * power(x, n-1)
/*
public class rev {

    public static int sq(int x, int n){
        if (n == 0) {
            return n;  // This is incorrect - should return 1
        }

        int s = x * sq(x,n-1);
        return s;

    }

    public static void main(String[] args) {

        System.out.println(sq(2,10));

    }
}
*/

// ? POWER CALCULATION (OPTIMIZED RECURSION)
// This function calculates x^n using optimized recursion (O(log n) time)
// Base case: if n is 0 then return 1
// Odd case: x * x^(n/2) * x^(n/2)
// Even case: x^(n/2) * x^(n/2)
/*
public class rev {
    public static int sq(int x, int n ){
        if(n==0){
            return 1;
        }

        int hp;
        if(n%2!=0){
             hp = x * sq(x, n/2) * sq(x, n/2);
        }else{
            hp =  sq(x, n/2) * sq(x, n/2);
        }

        return hp;
    }
    public static void main(String[] args) {
        System.out.println(sq(2, 10));
    }
}
*/

// ? BACKTRACKING: PRINT 1 TO N
// This function prints numbers from 1 to n using backtracking (tail recursion)
// Base case: if i < 1 then return
// Recursive case: call bt(i-1) then print i
/*
// Backtracking way to print 1 to n, without using additional parameters
public class rev {
    public static void bt(int i){
#         if (i<1){ 
            return;
        }

#       bt(i-1);
        System.out.print(i+" ");

    }

    public static void main(String[] args) {
        bt(3);
    }
}
*/

// ? BACKTRACKING: PRINT N TO 1
// This function prints numbers from n to 1 using backtracking
// Base case: if i > n then return
// Recursive case: call bt(i+1,n) then print i
/*
// Backtracking way to print n to 1, using recursion
public class rev {
    public static void bt(int i,int n){
        if (i>n) {
            return;
        }
        bt(i+1,n);

        System.out.println(i+" ");

    }

    public static void main(String[] args) {
        bt(1,3);  
    }
}
*/

// ? PARAMETRIC RECURSION: SUM CALCULATION
// This function calculates sum of numbers from 1 to n using parametric recursion
// Uses an additional parameter 's' to accumulate the sum
// Base case: if i < 1 then print and return the sum
// Recursive case: call sum(i-1, s+i)
/*
// Sum using parametric recursion
public class rev {

    public static void sum(int i, int s){
        if(i<1){        // #  agar i ki value 1 se kum hui to
            System.out.println(s);  // # sum ko print krwa do
            return;
        }
        sum(i-1,s+i); // # recusion ke liya tum i ki value kam kro or sath hi sum i ko add kr do
    }

    public static void main(String[] args) {
        sum(3,0);
    }
}
*/

// ? FUNCTIONAL RECURSION: SUM CALCULATION
// This function calculates sum of numbers from 1 to n using functional recursion
// Returns the sum instead of using an additional parameter
// Base case: if n is 0 then return 0
// Recursive case: n + sum(n-1)
/*
// Sum of i using functional recursion
public class rev {

    public static int fn(int n) {
        // if (n == 0) {
        //     return 0;
        // }
        // int sum = n + fn(n - 1);
        // return sum;
// # in easy way in 1 line 
        return (n ==0)?0:  n + fn(n-1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fn(n));

    }
}
*/

// ? FACTORIAL CALCULATION
// Calculates factorial of n using recursion
// Step by solution:
// n! = n * (n-1)!
// 4! = 4 x 3 x 2 x 1 = 4 x (4-1)! = 4 x 3!
/*
// Factorial using recursion
public class rev {

    public static int fact(int n) {

        // if (n == 0) {
        //     return 1;
        // }
        // return n * fact(n - 1);

        return (n==0)? 1: n* fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
*/

// ? SWAP ARRAY ELEMENTS (Method 1)
// Swaps array elements from both ends moving toward center
// Uses recursion to reverse the array
/*
// Swap an array - method 1
public class rev {
   public static void swap(int arr[],int a, int b) {
      int c = arr[a];
      arr[a] = arr[b];
      arr[b] = c;
   }

   public static void ar(int arr[], int i, int n) {
      if (i >= n)
         return;

      swap(arr, i, n);
      ar(arr, i + 1, n - 1);

   }

   public static void print(int arr[]){
      for (int num : arr) {
         System.out.println(num);
      }
   }

   public static void main(String[] args) {

      int arr[] = { 1, 2, 3, 4, 5 };
      ar(arr, 0, arr.length-1);
        print(arr);

   }
}
*/

// ? SWAP ARRAY ELEMENTS (Method 2)
// Alternative approach to swap array elements from both ends
// Uses recursion to reverse the array more efficiently
/*
// Swap an array - method 2
public class rev {
   public static void swap(int arr[],int a, int b) {
      int c = arr[a];
      arr[a] = arr[b];
      arr[b] = c;
   }

   public static void ar(int arr[], int i, int n) {
      if (i >= n/2) return;

      swap(arr, i, n-i-1);
      ar(arr, i + 1, n);

   }

   public static void print(int arr[]){
      for (int num : arr) {
         System.out.println(num);
      }
   }

   public static void main(String[] args) {

      int arr[] = { 1, 2, 3, 4, 5 };
      ar(arr, 0, arr.length);
      print(arr);
   }
}
*/

// ? CHECK IF STRING IS PALINDROME
// Checks if a string is a palindrome using recursion
// Compares characters from both ends moving toward center
/*
// Check if string is palindrome using recursion
public class rev {
   public static boolean pal(String s, int i) {
      if (i >= s.length()/2)  // Fixed: should be length/2 to compare till middle
         return true;
      if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;

      return pal(s,i+1);

   }
    public static void swap(int arr[],int a, int b) {
      int c = arr[a];
      arr[a] = arr[b];
      arr[b] = c;
   }

   public static void main(String[] args) {
      String st = "mada3";
      System.out.println(pal(st,0));

   }
}
*/

// ? GENERATE ALL SUBSEQUENCES
// Generates all possible subsequences of an array using recursion
// For each element, we either include it or exclude it from the subsequence
/*
// Generate all subsequences of an array
/*
 * Subsequence tree visualization:
 * Start → []
 * |
 * ├── include 3 → [3]
 * │   ├── include 1 → [3,1]
 * │   │   ├── include 2 → [3,1,2]
 * │   │   └── exclude 2 → [3,1]
 * │   └── exclude 1 → [3]
 * │       ├── include 2 → [3,2]
 * │       └── exclude 2 → [3]
 * └── exclude 3 → []
 *     ├── include 1 → [1]
 *     │   ├── include 2 → [1,2]
 *     │   └── exclude 2 → [1]
 *     └── exclude 1 → []
 *         ├── include 2 → [2]
 *         └── exclude 2 → []

 */
/*
import java.util.*;

public class rev {

   public static void stat(int arr[],ArrayList<Integer> list, int i) {
      if (i >= arr.length) {
         System.out.println(list);
         return;
      }
      list.add(arr[i]);
      stat(arr,list,i+1);
      list.remove(list.size()-1);
      stat(arr,list, i+1);
   }

   public static void main(String[] args) {
      int arr[] = { 3, 1, 2 };
      ArrayList<Integer> list = new ArrayList<>();

      stat(arr,list,0);

   }
}
*/

// ? GENERATE SUBSEQUENCES WITH TARGET SUM
// Generates all subsequences of an array that sum up to a given target
// Uses recursion to explore all possible combinations

import java.util.*;

public class rev {

   // Recursive function to generate subsequences with target sum
   // arr[]: input array
   // list: current subsequence being built
   // i: current index in the array
   // s: current sum of elements in the subsequence
   // key: target sum we want to achieve
   public static void stat(int arr[], ArrayList<Integer> list, int i, int s, int key) {

      if (i >= arr.length) {
         if (s == key) {
            System.out.println(list);  // Print subsequence if sum matches target
         }
         return;
      }
      list.add(arr[i]);      // Include current element in subsequence
      s += arr[i];           // Add current element to sum
      stat(arr, list, i + 1, s, key);  // Recurse with element included
      s -= arr[i];           // Backtrack: remove element from sum
      list.remove(list.size() - 1);    // Backtrack: remove element from list
      stat(arr, list, i + 1, s, key);  // Recurse with element excluded
   }

   public static void main(String[] args) {
      int arr[] = { 3, 1, 2 };
      int sum = 3;           // Target sum

      ArrayList<Integer> list = new ArrayList<>();

      stat(arr, list, 0, 0, sum);  // Find all subsequences with sum = 3
   }
}
