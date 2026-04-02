public class Rec3 {
    public static void main(String[] args) {
int []a={1,4,6,12,11,28};
int l=Integer.MAX_VALUE;
int sl=Integer.MAX_VALUE;
for (int i = 0; i < a.length; i++) {
    if(a[i]<l){
        sl=l;
        l=a[i];
    }
    else if(a[i]<sl && a[i]!=l){
        sl=a[i];
    }
}
System.out.println(sl);
    }
}