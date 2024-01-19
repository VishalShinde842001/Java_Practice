import java.util.Arrays;

public class Triple_Sum_In_Array {
    public static void main(String[] args) {
        int[] arr={1,4,45,6,10,8};
        System.out.println(find3Numbers(arr,arr.length,13));
    }


    public static boolean find3Numbers(int[] A, int n, int X) {
        Arrays.sort(A);
        for(int i=0;i<n-1;i++){
            int j=i+1;int k=n-1;
            while(j<k){
                if(A[j]+A[k]>X-A[i]){
                    k--;
                }else if(A[j]+A[k]<X-A[i]){
                    j++;
                }else{
                    return true;
                }
            }
        }
        return false;


    }
    //Brute force aprroch
  /*  public static boolean find3Numbers(int[] A, int n, int X) {
        for(int i=0;i<n-2;i++){
           for(int j=i+1;j<n;j++){
               for(int k=j+1;k<n;k++){
                   if(A[i]+A[j]+A[k]==X){
                       return true;
                   }
               }
            }
        }
        return false;
    }*/
}
