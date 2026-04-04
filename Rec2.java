public class Rec2 {

    public static void main(String[] args) {
        int[] a = {1,1,1,0,1,0,0,0,1,1,1,0};
        int count=0;
        int k=0;
      
       for (int i = 0; i < a.length; i++) {
         if(a[i]==1){
            count++;
            k=Math.max(k,count);
         }
         else{
            count=0;
         }
       }
       System.out.println(k);
    }
}