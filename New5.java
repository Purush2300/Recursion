public class New5 {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, -1, -3, -4};

        int[] positive = new int[a.length];
        int[] negative = new int[a.length];

        int p = 0, n = 0;

        // separate elements
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                negative[n++] = a[i];   // FIXED
            } else {
                positive[p++] = a[i];   // FIXED
            }
        }

        // merge alternately
        int i = 0, j = 0, k = 0;

        while (i < p && j < n) {
            a[k++] = positive[i++];
            a[k++] = negative[j++];
        }

        // remaining elements
        while (i < p) {
            a[k++] = positive[i++];
        }

        while (j < n) {
            a[k++] = negative[j++];
        }

        // print
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}