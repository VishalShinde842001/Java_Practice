import java.util.Arrays;

public class K_Larget_Element {
    public static void main(String[] args) {
        int[] arr={12,5,787,1,23};
        K_Larget_Element k=new K_Larget_Element();
        for(Integer i:k.kLargest(arr,arr.length,2)){
            System.out.println(i+" ");
        }
    }
    int[] kLargest(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int[] ar=new int[k];
        for(int i=0;i<k;i++){
            ar[i]=arr[n-1-i];
        }

        return ar;
    }

}
