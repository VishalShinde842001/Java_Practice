//very important problems

import java.util.ArrayList;
import java.util.Arrays;

public class Find_All_Pairs_with_Given_Sum {
    public static void main(String[] args) {
     long[]   A = {-1, -2, 4, -6, 5, 7};
      long[]  B= {6, 3, 4, 0};
      Find_All_Pairs_with_Given_Sum f=new Find_All_Pairs_with_Given_Sum();
      for(pair p:f.allPairs(A,B,A.length,B.length,8)){
          System.out.print(p.first+" "+p.second);
          System.out.println();
      }
    }

    public pair[] allPairs( long[] A, long[] B, long N, long M, long X) {

            ArrayList<pair>list=new ArrayList<>();

            Arrays.sort(A);
            Arrays.sort(B);

            int i=0;
            int j=B.length-1;
            while(i<N && j>=0){
                long  sum=A[i]+B[j];
                if(sum<X){
                    i++;
                }
                else if(sum>X){
                    j--;
                }
                else{
                    list.add(new pair(A[i],B[j]));
                    i++;
                    j--;
                }
            }
            pair[] pair=new pair[list.size()];
            return list.toArray(pair);

        }

}
class pair{
    long first,second;
    public pair(long first,long second){
        this.first=first;
        this.second=second;
    }
}
