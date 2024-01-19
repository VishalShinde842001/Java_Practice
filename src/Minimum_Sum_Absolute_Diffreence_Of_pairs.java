import java.util.Arrays;

public class Minimum_Sum_Absolute_Diffreence_Of_pairs {
    public static void main(String[] args) {
        int[] A={4,1,8,7};
        int[] B={2,3,6,5};
        Minimum_Sum_Absolute_Diffreence_Of_pairs m=new Minimum_Sum_Absolute_Diffreence_Of_pairs();
        System.out.println(m.findMinSum(A,B,A.length));
    }
    long findMinSum(int[] A,int[] B,int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        long sub=0;
        for(int i=0;i<N;i++){
            int a=A[i]-B[i];
            if(a>0){
                sub=sub+a;
            }
            else{
                sub=sub+(-1)*a;
            }
        }
        return sub;
    }
}
