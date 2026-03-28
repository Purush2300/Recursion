public class Rec2 {
 public static void main(String[] args) {
    int i=6;
    int a=Indexpresentvalue(i);
    System.out.println(a);
 }

 private static int Indexpresentvalue(int i) {
   if(i==0) return 0;
   if(i==1) return 1;
    return Indexpresentvalue(i-1)+Indexpresentvalue(i-2);
 }   
}
