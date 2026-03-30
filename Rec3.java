public class Rec3 {
    public static void main(String[] args) {
        String a = "...good..morning...";
        String t = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);
            if (ch != '.') {
                t += ch;   // add letters
            } else if (t.length() > 0 && t.charAt(t.length() - 1) != '.') {
                t += ch;   // add dot only if previous char in t is not dot
            }
        }

        System.out.println(t);
    }
}