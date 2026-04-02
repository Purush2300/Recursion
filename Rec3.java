public class Rec3 {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int k=2;
        int n=a.length;
        k=k%n;
        int [] temp=new int[k];
        for (int i = 0; i<k; i++) {
            temp[i]=a[i];
            
        }
        for (int i = k; i < a.length; i++) {
            a[i-k]=a[i];
        }
        int j=0;
        for (int i = n-k; i < n; i++) {
            a[i]=temp[j];
            j++;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    }

