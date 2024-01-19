
import java.util.LinkedHashMap;

public class Frequencies_Of_Limimted_Range {
    public static void main(String[] args) {
        int[] arr={2,3,2,3,5};
        frequencyCount(arr,arr.length,5);
    }
    public static void frequencyCount(int[] arr, int N, int P)
    {
        LinkedHashMap<Integer,Integer> lMap=new LinkedHashMap<>();

        for(int i=1;i<=P;i++){
            lMap.put(i,0);
        }
        for(int i=0;i<N;i++){
            if(lMap.containsKey(arr[i])){
                lMap.put(arr[i],lMap.get(arr[i])+1);
            }

        }

        for(int i=0;i<N;i++){
            arr[i]=lMap.get(arr[i]);
        }
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
