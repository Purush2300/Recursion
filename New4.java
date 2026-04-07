public class New4 {
    public static void main(String[] args) {
        int []a={3,1,-2,-5,-6,2};
        int []ans=new int[a.length];
        int p=0;
        int n=1;
        for (int i = 0; i < ans.length; i++) {
            if(a[i]>0){
                ans[p]=a[i];
                p+=2;
            }
            else{
                ans[n]=a[i];
                n+=2;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
