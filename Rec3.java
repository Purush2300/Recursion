public class Rec3 {
    public static void main(String[] args) {
       String a="aabbcba";
       String t="";
       t=t+a.charAt(0);
       for (int i = 1; i < a.length(); i++) {
        if(a.charAt(i)!=a.charAt(i-1)){
            t=t+a.charAt(i);
        }
       }
       System.out.println(t);
    }
}
