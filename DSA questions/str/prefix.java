public class prefix {

    public static String long(String str){
        
        if(str.length ==0 || str == null) return "";

        for (int i = 0; i < str[0].length; i++) {
            Char ch = str.charAt(i);
            for(int j =1;j<str[0].length;j++){
                if(i == str[j].length || str[j].charAt(i)!= ch){
                    return str[0].substring(0,i);
                }
            }
        }
        return str[0];
    }

    public static void main(String[] args) {
        String str = ["flower","flow","flight"];

        System.out.println(long(str));

    }
}