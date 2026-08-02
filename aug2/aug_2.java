public class aug_2 {
    public static void main(String[] args) {
        int[]arr={0,0,0,2,0,3,5};
        moveZeroToEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // int k=3;
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>arr[(i+1)%n]){
        //         System.out.println(true);
                
        //     }

        // }
    //    int j=0;
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]!=arr[j]){
    //             j++;
    //             arr[j]=arr[i];
    //         }
    //     }
    //     System.out.println(j);
            // reverse(arr,0,arr.length-1);
            // reverse(arr,0,k-1);
            // reverse(arr,k,arr.length-1);
            // for(int i=0;i<arr.length;i++){
            //     System.out.print(arr[i]+" ");
            // }
    }

    // private static void reverse(int[] arr, int i, int j) {
    //   while(i<j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    //     i++;
    //     j--;
    //   }
    // }

    private static void moveZeroToEnd(int[] arr) {
       int j=0;
       for(int i=1;i<arr.length;i++){
        if(arr[i]!=0 && arr[j]==0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
       }
    }
}
