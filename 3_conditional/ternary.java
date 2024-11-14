public class ternary {
    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
        int larger = (5>3)?5:3;
        System.out.println(larger);

        int number = 1243244;

        String type = ((number%2)==0)?"even":"odd";
        System.out.println(type);
        
    }

}
