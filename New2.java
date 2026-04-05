public class New2 {
    public static void main(String[] args) {
        int []a={2,0,2,1,1,0};
        int l=0;
        int m=0;
        int h=a.length-1;
        while(m<=l){
            if(a[m]==0){
                int temp=a[m];
                a[m]=a[l];
                a[l]=temp;
                l++;
                m++;
            }
            else if(a[m]==1){
                m++;
            }
            else if(a[m]==2){
                 int temp=a[m];
                a[m]=a[h];
                a[h]=temp;
                h--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
