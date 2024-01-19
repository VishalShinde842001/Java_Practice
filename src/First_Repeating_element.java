
import java.util.HashMap;

public class First_Repeating_element {
    public static void main(String[] args) {
        int[] arr={1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr,arr.length));
    }
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i+1);
            }
            else{
                if(map.get(arr[i])<min){
                    min=map.get(arr[i]);
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
