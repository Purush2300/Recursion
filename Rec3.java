public class Rec3 {
    public static void main(String[] args) {
        int []a={0,2,0,3,0,4,0,5};
       int i=0;
       int j=0;
       while(j<a.length){
        if(a[j]==0){
            
        }
        else{
            
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
        }
        j++;
       }
       for (int j2 = 0; j2 < a.length; j2++) {
        System.out.println(a[j2]);
       }
    }
}
