public class Rec3 {
    public static void main(String[] args) {
        String a = "Too hot to hoot";
        String t = "";
for (int i = 0; i < a.length(); i++) {
    char ch = a.charAt(i);
    if(ch>='A' && ch<='Z'){
        t=t+(char)ch+32;
    }
    else if(ch==' ' && (ch>='0' && ch<='9')){

    }
    else{
        t=t+ch;
    }
}
      

        System.out.println(t);
    }
}