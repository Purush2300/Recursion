public class New6 {
    public static void main(String[] args) {
        int []a={10,22,12,0,3,6};
      
        int maximum=Integer.MIN_VALUE;
        for (int i = a.length-1; i >=0; i--) {
            if(a[i]>maximum){
            System.out.println(a[i]+" ");
                maximum=a[i];
            }
        }
       
    }
}
