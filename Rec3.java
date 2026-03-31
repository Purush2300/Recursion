public class Rec3 {
    public static void main(String[] args) {
  int[][] matrix = {
    {1, 2, 3,4},
    { 5, 6,7,8},
    {8,9,20,11},
    {12,13,14,15}
};
for (int i = 0; i < matrix.length; i++) {
    if(i%2==0){
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j]);
        }
    }
    
        else{
            for (int j2 = matrix[i].length-1; j2 >=0; j2--) {
                System.out.print(matrix[i][j2]);
            }
        }
    }
    System.out.println();
}



    }

