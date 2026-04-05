import java.util.HashMap;

public class New1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] a = {1,2,6,8,11,5};
        int target = 14;

        for (int i = 0; i < a.length; i++) {
            int complement = target - a[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair: " + map.get(complement) + ", " + i);
            }

            map.put(a[i], i);
        }
    }
}