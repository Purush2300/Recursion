public class New8 {
    public static void main(String[] args) {
        int[] a = {1,1,5};
int n=a.length;
int i=n-2;



while(i>=0 && a[i]<a[i+1]){
    i--;
}
if(a[i]>=0){
    int j=n-1;
    while (a[j]<=a[i]) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=a[i];
    }
}     

        // Step 4: reverse right part
        reverse(a, i + 1, n - 1);

        // ✅ PRINT RESULT
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    private static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}