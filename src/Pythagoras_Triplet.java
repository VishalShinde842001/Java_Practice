import java.util.ArrayList;
import java.util.Arrays;

public class Pythagoras_Triplet {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 5};
        Pythagoras_Triplet p=new Pythagoras_Triplet();
        System.out.println(p.checkTriplet(arr,arr.length));
    }
    boolean checkTriplet(int[] arr, int n) {
        ArrayList<Integer> arList=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            arList.add(arr[i]*arr[i]);
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            if(arList.contains(value(arr[i],arr[j]))){
                return true;
            }}
        }
        return false;
    }
    public int value(int a,int b){
        return (int) (Math.pow(a,2)+Math.pow(b,2));
    }
}
