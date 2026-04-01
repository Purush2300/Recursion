public class Rec3 {
    public static void main(String[] args) {
        int[][] a = {
            {1,0,1,1},
            {1,1,1,0},
            {1,0,0,1},
            {1,1,0,0}
        };

        int m = a.length;
        int n = a[0].length;

        int[][] copy = new int[m][n];

        // copy original
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                copy[i][j] = a[i][j];
            }
        }

        // process zeros
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(copy[i][j] == 0) {
                    markRow(a, i);
                    markCol(a, j);
                }
            }
        }

        // print result
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void markRow(int[][] a, int row) {
        for(int j = 0; j < a[0].length; j++) {
            a[row][j] = 0;
        }
    }

    public static void markCol(int[][] a, int col) {
        for(int i = 0; i < a.length; i++) {
            a[i][col] = 0;
        }
    }
}