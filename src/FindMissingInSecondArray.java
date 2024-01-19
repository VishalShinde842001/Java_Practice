import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindMissingInSecondArray {
    public static void main(String[] args) {
       long[] A = {1, 2, 3, 4, 5, 10};
       long[] B = {2, 3, 1, 0, 5};
       FindMissingInSecondArray f=new FindMissingInSecondArray();
       for(long i:f.findMissing(A,B,A.length,B.length)){
           System.out.print(i+" ");
       }
    }
    ArrayList<Long> findMissing(long[] A, long[] B, int N, int M)
    {
        ArrayList<Long> arList=new ArrayList<>();

        Set<Long> set=new HashSet<>();
        for(int i=0;i<M;i++){
            set.add(B[i]);
        }
        for(int i=0;i<N;i++){
            if(!set.contains(A[i])){
                arList.add(A[i]);
            }
        }
        return arList;
    }
}