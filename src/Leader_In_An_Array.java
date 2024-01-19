import java.util.ArrayList;
import java.util.Collections;

public class Leader_In_An_Array {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        for(Integer i:leaders(arr,arr.length)){
            System.out.print(i+" ");
        }
    }
    static ArrayList<Integer> leaders(int[] arr, int n){
        ArrayList<Integer> arList=new ArrayList<>();
        arList.add(2);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                arList.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(arList);
        return arList;
    }
}
