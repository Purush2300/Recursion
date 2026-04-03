public class Rec3 {
    public static void main(String[] args) {
       int []a={4,5,6,1,2,3};
       int k=a.length;
       int count=0;
       for (int i = 0; i < a.length; i++) {
        if(a[i]>a[(i+1)%k]){
            count++;
        }
       }
       System.out.println(count<=1);
    }

    }

