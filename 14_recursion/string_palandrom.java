public class string_palandrom {

    public static boolean pal(String s, int i) {
      if (i >= s.length())
         return true;
      if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;

      return pal(s,i+1);

   }

   public static void main(String[] args) {
      String st = "mada3";
      System.out.println(pal(st,0));
       
   }
}