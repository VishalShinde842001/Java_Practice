import java.util.LinkedHashSet;

public class Union_Of_Two_array {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2};
        System.out.println(doUnion(a,a.length,b,b.length));
    }
    public static int doUnion(int[] a, int n, int[] b, int m)
    {
        LinkedHashSet<Integer> hset=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            hset.add(a[i]);
        }
        for(int i=0;i<m;i++){
            hset.add(b[i]);
        }
        return hset.size();
    }
}
