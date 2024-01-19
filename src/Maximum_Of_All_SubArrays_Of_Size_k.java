import java.util.ArrayList;

public class Maximum_Of_All_SubArrays_Of_Size_k {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,4,5,2,3,6};
        System.out.println(max(arr,arr.length,3));
    }
    static ArrayList<Integer> max_of_subarrays(int[] arr, int n, int k)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(n==1){
            list.add(arr[0]);
            return list;
        }
        if(n==2){
            list.add(Math.max(arr[0],arr[1]));
            return list;

        }
        for(int i=0;i<n-k+1;i++){
            list.add(max(arr,i,k+i-1));
        }
        return list;
    }
    public static int max(int[] arr,int start,int end){
        int maxi=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
}
