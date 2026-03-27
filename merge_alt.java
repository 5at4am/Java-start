public class merge_alt {

    public static String merge(String s1, String s2){
        int i =0;
        StringBuilder sb = new StringBuilder();
        while(i<s1.length() || i<s2.length()){
            if(i<s1.length()){
                sb.append(s1.chatAt(i));
            }
            if(i<s2.length()){
                sb.append(s2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "pqrstuv";
        

    }
    
}
