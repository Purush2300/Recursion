import java.util.HashMap;

public class New3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] a = {2,2,3,2,2,4};

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);

            if (map.get(a[i]) > a.length / 2) {
                System.out.println("Majority element: " + a[i]);
                return; // allowed → exits main
            }
        }

        System.out.println("No majority element");
    }
}