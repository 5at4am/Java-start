public class duplicate {

    public static void dupl(String str, int idx, StringBuilder sb, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(sb.toString());
            return;
        }
        char curr = str.charAt(idx);
        if (map[curr - 'a'] == true) {
            dupl(str, idx + 1, sb, map);
        } else {
            map[curr - 'a'] = true;
            dupl(str, idx + 1, sb.append(curr), map);
        }
    }

    public static void main(String[] args) {
        String str = "satyamraj";
        dupl(str, 0, new StringBuilder(""), new boolean[26]);

    }

}
