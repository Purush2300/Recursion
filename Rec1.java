public class Rec1 {
    static int fun(int i){
        
        if(i==0){
            return 0;
        }
       
        return fun(i/10)+i%10;
       
        
    }
    public static void main(String[] args) {
        
        int i=12345;
        System.out.println(fun(i));
       
    }
}
