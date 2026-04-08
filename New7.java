public class New7 {
    public static void main(String[] args) {
        int []a={102,6,7,5,4,103,104,105,106,3,2,1,1};
        int longest=1;
      
        for (int i = 0; i < a.length; i++) {
            int x=a[i];
             int count=1;
             while(ls(a,x+1)==true){
                x=x+1;
                count+=1;
             }
             longest=Math.max(longest, count);
        }
        System.out.println(longest);
    }

    private static boolean ls(int[] a, int i) {
      for (int j = 0; j < a.length; j++) {
        if(a[j]==i){
            return true;
        }
      }
      return false;
    }

}
