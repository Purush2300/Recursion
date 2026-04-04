import java.util.HashMap;

public class Lon {
    public static void main(String[] args) {
        int []a={1,2,3,4,1,2,2,2,4};
        int k=6;
        int z=subarray(a,k);
        System.out.println(z);
    }

    private static int subarray(int[] a, int k) {
     HashMap<Integer, Integer> map = new HashMap<>();
int sum = 0;
int maxLen = 0;

for (int i = 0; i < a.length; i++) {
    sum+=a[i];
    if(sum==k){
        maxLen=i+1;
    }
    if(map.containsKey(sum-k)){
        maxLen=Math.max(maxLen, i-map.get(sum-k));
    }

    if(!map.containsKey(sum)){
        map.put(sum, i);
    }

}
       return maxLen; 
    }
}
