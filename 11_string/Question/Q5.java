package Question;

import java.util.*;
public class Q5 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = "earth";
        String str2 = "heart";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if(result){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }else{
            System.out.println("Not Anagrams");
        }
        sc.close();
    }
}