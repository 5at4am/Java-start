// public class rev {
//     public static int num(int n) {
//         if (n==0) {
//             return 1;
//         }
//         // int fnm1 = num(n-1);
//         int fn = n * num(n-1);
//         return fn;

//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(num(n));

//     }
// }

// public class rev {
//     public static int sum (int n){
//         if (n == 1) {
//             return 1;
//         }
//         int sn = n + sum(n-1);
//         return sn;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(sum(n));

//     }
// }

// public class rev {
//     public static int fib(int n ){
//         if (n==0 || n==1) {
//             return n;

//         }
//         int fn = fib(n-1) +fib(n-2);
//         return fn;

//     }

//     public static void main(String[] args) {
//         int num = 7;
//         System.out.println(fib(num));

//     }
// }

// public class rev {

//     public static boolean sort(int n[], int i){

//         if(n[i] > n[i+1]) {
//             return false;

//         }

//         return sort(n,i+1); 
//     }

//     public static void main(String[] args) {
//         int n[]= {1,2,5,4,5};
//         System.out.println(sort(n,0));
//     }
// }

// public class rev {

// public static int first(int n[], int key,int i){

//     if(n[i] == key){
//         return i;
//     }

//     return first(n,key,i+1);
// }

//     public static int last(int[] n, int key, int i){
//         if(i== n.length){
//             return -1;
//         }
//         int isfound = last(n,key,i+1);
//         if(isfound != -1){
//             return isfound;

//         }
//         if(n[i]==key){
//             return i;
//         }

//         return isfound;

//     }

//     public static void main(String[] args) {
//         int n[]={2,5,3,8,9,2,7,9,3,0,2,6,5,5,8,9};
//         System.out.println(last(n,9,0) +" : index");
//     }
// }

// public class rev {

//     public static int sq(int x, int n){
//         if (n == 0) {
//             return n;
//         }

//         int s = x * sq(x,n-1);
//         return s;

//     }

//     public static void main(String[] args) {

//         System.out.println(sq(2,10));

//     }
// }

// public class rev {
//     public static int sq(int x, int n ){
//         if(n==0){
//             return 1;
//         }

//         int hp;
//         if(n%2!=0){
//              hp = x * sq(x, n/2) * sq(x, n/2);
//         }else{
//             hp =  sq(x, n/2) * sq(x, n/2);
//         }

//         return hp;
//     }
//     public static void main(String[] args) {
//         System.out.println(sq(2, 10));
//     }
// }

// ?  backtracking way, print 1 to n,  without fn(i+1,n)

// public class rev {
//     public static void bt(int i){
// #         if (i<1){ 
//             return;
//         }

// #       bt(i-1);
//         System.out.print(i+" ");

//     }

//     public static void main(String[] args) {
//         bt(3);
//     }
// }

// ? backtracking way, print n to 1,  without fn(i-1,n) using recursion

// public class rev {
//     public static void bt(int i,int n){
//         if (i>n) {
//             return;
//         }
//         bt(i+1,n);

//         System.out.println(i+" ");

//     }

//     public static void main(String[] args) {
//         bt(1,3);  
//     }
// }

// ? sum or i using parametric

// public class rev {

//     public static void sum(int i, int s){
//         if(i<1){        // #  agar i ki value 1 se kum hui to
//             System.out.println(s);  // # sum ko print krwa do
//             return;
//         }
//         sum(i-1,s+i); // # recusion ke liya tum i ki value kam kro or sath hi sum i ko add kr do
//     }

//     public static void main(String[] args) {
//         sum(3,0);
//     }
// }

// ? sum of i using function

// public class rev {

//     public static int fn(int n) {
//         // if (n == 0) {
//         //     return 0;
//         // }
//         // int sum = n + fn(n - 1);
//         // return sum;
// // # in easy way in 1 line 
//         return (n ==0)?0:  n + fn(n-1);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         System.out.println(fn(n));

//     }
// }

// ? factorial
//  step by solution -
/* 
 n! 
 4! = 4 x 3 x 2 x 1;
 4! = 4 x (n-1)!
            ->(4-1)! = 3! = 3 x (n-1)!
                                ->(3-1)! = 2! = 2 x (n-1)!

    we can say that the n = n x (n-1)
 */

// public class rev {

//     public static int fact(int n) {

//         // if (n == 0) {
//         //     return 1;
//         // }
//         // return n * fact(n - 1);

//         return (n==0)? 1: n* fact(n-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(fact(4));
//     }
//  }

// // ? swap an array
// public class rev {
//    public static void swap(int arr[],int a, int b) {
//       int c = arr[a];
//       arr[a] = arr[b];
//       arr[b] = c;
//    }

//    public static void ar(int arr[], int i, int n) {
//       if (i >= n)
//          return;

//       swap(arr, i, n);
//       ar(arr, i + 1, n - 1);

//    }

//    public static void print(int arr[]){
//       for (int num : arr) {
//          System.out.println(num);
//       }
//    }

//    public static void main(String[] args) {

//       int arr[] = { 1, 2, 3, 4, 5 };
//       ar(arr, 0, arr.length-1);
//         print(arr);

//    }
// }




// ? swap an array

// public class rev {
//    public static void swap(int arr[],int a, int b) {
//       int c = arr[a];
//       arr[a] = arr[b];
//       arr[b] = c;
//    }

//    public static void ar(int arr[], int i, int n) {
//       if (i >= n/2) return;

//       swap(arr, i, n-i-1);
//       ar(arr, i + 1, n);

//    }

//    public static void print(int arr[]){
//       for (int num : arr) {
//          System.out.println(num);
//       }
//    }

//    public static void main(String[] args) {
      
//       int arr[] = { 1, 2, 3, 4, 5 };
//       ar(arr, 0, arr.length);
//       print(arr);
      
//    }
// }



// ? check if strin is palandrom using recursion

public class rev {
   public static boolean pal(String s, int i) {
      if (i >= s.length())
         return true;
      if (s[i] != s[s.length() - i - 1] return false;

      return pal(s,i+1);

   }
    public static void swap(int arr[],int a, int b) {
      int c = arr[a];
      arr[a] = arr[b];
      arr[b] = c;
   }

   public static void main(String[] args) {
      String st = "madam";
      System.out.println(pal(st,0));
       
   }
}