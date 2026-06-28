import java.util.*;

public class ticket {

    public static String getStart(HashMap<String, String> ticket) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : ticket.keySet()) {
            revMap.put(ticket.get(key), key);
        }

        for (String key : ticket.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // starting point
            }
        }  
        return null;

    }

    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("chennai", "bengaluru");
        ticket.put("mumbai", "delhi");
        ticket.put("goa", "chennai");
        ticket.put("delhi", "goa");

        System.out.println(ticket);

        String start = getStart(ticket);
        System.out.print(start);
        for (String key : ticket.keySet()) {
            System.out.print(" -> " + ticket.get(start));
            start = ticket.get(start);
            
        }
    }

}
