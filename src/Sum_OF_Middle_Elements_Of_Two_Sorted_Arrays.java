import java.util.ArrayList;
import java.util.Arrays;

public class Sum_OF_Middle_Elements_Of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] Ar1 = {1, 2, 4, 6, 10};
        int[] Ar2 = {4, 5, 6, 9, 12};
        Sum_OF_Middle_Elements_Of_Two_Sorted_Arrays s=new Sum_OF_Middle_Elements_Of_Two_Sorted_Arrays();
        System.out.println(s.findMidSum(Ar1,Ar2,Ar1.length));
    }
    int findMidSum(int[] ar1,int[] ar2,int n){
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr1.add(ar1[i]);
            arr1.add(ar2[i]);
        }
        arr1.sort(null);
        return (arr1.get(n)+arr1.get(n-1));
    }
   /* int findMidSum(int[] ar1, int[] ar2, int n) {
        int[] finalAr=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i++){
            if(i<n){
                finalAr[i]=ar1[i];
            }
            else{
                finalAr[i]=ar2[j];
                j++;
            }
        }
        Arrays.sort(finalAr);
        return finalAr[n]+finalAr[n-1];
    }*/
}
