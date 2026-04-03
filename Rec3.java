public class Rec3 {
    public static void main(String[] args) {
     int[] a = {0,0,3,53,2,3,4,0,7};
int j = 0;

for (int i = 0; i < a.length; i++) {
    if (a[i] != 0) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        j++;
    }
}
     
      for (int j2 = 0; j2 < a.length; j2++) {
        System.out.println(a[j2]);
      }
    }
    }
   

    

