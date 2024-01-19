import java.util.HashMap;

public class Count_Pair_With_Given_Sum {
    public static void main(String[] args) {
        int[] arr={1,3,5,5,1};
        Count_Pair_With_Given_Sum c=new Count_Pair_With_Given_Sum();
        System.out.println(c.getPairsCount(arr,arr.length,6));
    }
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i])){
                count=count+map.get(k-arr[i]);
            }
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        return count;
    }
}
