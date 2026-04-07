public class New5 {
    public static void main(String[] args) {
        int[]a={7,1,5,3,6,4};
        int mini=a[0];
        int profit=0;
        for (int i = 1; i < a.length; i++) {
            int cost=a[i]-mini;
            profit=Math.max(profit, cost);
            mini=Math.min(mini,a[i]);
        }
        System.out.println(profit);
    }
}