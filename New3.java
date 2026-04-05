public class New3 {
    public static void main(String[] args) {
        int []a={2,2,3,2,2,4};
        System.out.println(majority(a));
    }

    private static int majority(int[] a) {


        int n=a.length;
        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>(n/2)){
               
                return a[i];
            }
        }
      

        return 0;
        
        
    }

}
