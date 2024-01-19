import java.util.Arrays;
import java.util.Collections;

public class Minimize_The_Sum_Of_Product {
    public static void main(String[] args) {
       long[] A = {3, 1, 1};
       long[] B = {6, 5, 4};
       Minimize_The_Sum_Of_Product m=new Minimize_The_Sum_Of_Product();
        System.out.println(m.minValue(A,B,A.length));

    }
    public long minValue(long[] a, long[] b, long n)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        long sum=0;
        for(int i=0;i<n;i++){
            sum=a[i]*b[(int)n-i-1]+sum;
        }
        return sum;
    }
}
