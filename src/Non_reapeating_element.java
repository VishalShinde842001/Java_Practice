import java.util.HashMap;
import java.util.Map;
public class Non_reapeating_element {
    public static void main(String[] args) {
      int[] arr = {-1, 2, -1, 3, 2};
      Non_reapeating_element n=new Non_reapeating_element();
        System.out.println(n.firstNonRepeating(arr,arr.length));

    }

    public int firstNonRepeating(int[] arr, int n)
    {
        // Complete the function
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], 0);
            }
        }
        for(int i = 0; i < n; i++){
            if(map.get(arr[i]) == 0){
                return arr[i];
            }
        }
        return 0;
    }
}
