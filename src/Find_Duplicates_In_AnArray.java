import java.util.ArrayList;
import java.util.Arrays;

public class Find_Duplicates_In_AnArray {
    public static void main(String[] args) {
       int[] arr={2,3,1,2,3};
       for(Integer i:duplicates(arr,arr.length)){
           System.out.println(i+" ");
       }
    }
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        Arrays.sort(arr);
        ArrayList<Integer> arlist=new ArrayList<>();
        int j=0;
        for(int i=1;i<n;i++){
            if(arr[j]==arr[i]){
                if(!arlist.contains((arr[i-1]))){
                    arlist.add(arr[i-1]);
                }
                j=j+2;
                i++;
            }else{
                j++;
            }
        }
        if(arlist.isEmpty()){
             arlist.add(-1);
        }
        return arlist;
    }
}
