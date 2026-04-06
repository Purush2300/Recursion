public class New4 {
    public static void main(String[] args) {
        int []a={1,2,3,-2,-5,9,6,2,3,-1,-2};
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            if(sum<0){
                sum=0;
            }
            else{
                maxsum=Math.max(maxsum, sum);
            }
        }
        System.out.println(maxsum);
    }
}
