
import java.util.HashMap;
import java.util.Map;

public class aug_2 {
    public static void main(String[] args) {
        int[]arr={3,2,3,2,4,3};
        System.out.println(maxFreqAndMinFreq(arr));
        // int[]arr1={1,4,6};
        // int[]arr2={2,3,5};
        // unionOfTwoArray(arr1,arr2);
        // moveZeroToEnd(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
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

    // private static void moveZeroToEnd(int[] arr) {
    //    int j=0;
    //    for(int i=1;i<arr.length;i++){
    //     if(arr[i]!=0 && arr[j]==0){
    //         int temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         j++;
    //     }
    //    }
    // }

    // private static void unionOfTwoArray(int[] arr1, int[] arr2) {
    //    int []res=new int[arr1.length+arr2.length];
    //    int s=0;
    //    int i=0;
    //    int j=0;
    //    while(i<arr1.length && j<arr2.length){
    //     if(arr1[i]<arr2[j]){
    //         res[s++]=arr1[i++];
    //     }
    //     else{
    //         res[s++]=arr2[j++];
    //     }
        
    //    }
    //    while(i<arr1.length){
    //     res[s++]=arr1[i++];
    //    }
    //    while(j<arr2.length){
    //     res[s++]=arr2[j++];
    //    }
    //    for(int k=0;k<res.length;k++){
    //     System.out.print(res[k]+" ");
    //    }
    // }

    private static String maxFreqAndMinFreq(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
       int maxFrequency=0;
       int minFrequency=0;
       int maxValue=Integer.MIN_VALUE;
       int minValue=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
       }

       for (Map.Entry<Integer, Integer> en : map.entrySet()) {
           Integer key = en.getKey();
           Integer val = en.getValue();
           
           if(val>maxValue){
            maxValue=val;
            maxFrequency=key;

           }
           if(val<minValue){
            minValue=val;
            minFrequency=key;
           }


       }
       return "maxFreq->  "+maxValue+ " maxValue-> "+maxFrequency+" minFreq-> "+minValue+" minValue-> "+minFrequency;
    }
}
