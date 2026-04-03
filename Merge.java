public class Merge {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={5,6,7};
        int i=0,j=0,k=0;
        int []res=new int[a.length+b.length];

        while(i<a.length && j<b.length){

            if(a[i]<b[j]){

                res[k]=a[i];
                k++;
                i++;

            }
            else{
                res[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            res[k]=a[i];
             k++;
            i++;

        }
           while(j<b.length){
            res[k]=b[j];
             k++;
            j++;

        }
        for (int l = 0; l < res.length; l++) {
            System.out.println(res[l]);
        }

    }
}
