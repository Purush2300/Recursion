public class Rec1 {
   
    public static void main(String[] args) {
    int[]a={1,1,1,0,0,1,0,0,1,1,1,0,1,1,1,0};
    int count=0;
    int m=Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
        if(a[i]!=0){
            count++;
            m=Math.max(m,count);
        }
        else{
            count=0;
        }
    }
       System.out.println(m);
       
    }
}
