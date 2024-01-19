import java.util.HashMap;
import java.util.Map;

public class Exceptionally_ood {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,1,3};
        Exceptionally_ood c=new Exceptionally_ood();
        System.out.println(c.getOddOccurrence(arr,arr.length));
    }
    int getOddOccurrence(int[] arr, int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()%2!=0) return m.getKey();
        }
        return 0;
    }
}
