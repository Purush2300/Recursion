public class Rec1 {
    static int fun(int a){
        if(a==1){
            return 1;
        }
       
        return a*fun(a-1);
       
        
    }
    public static void main(String[] args) {
        int a=5;
        int j=fun(a);
         System.out.println(j);
    }
}
