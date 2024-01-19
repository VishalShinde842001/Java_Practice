public class Rearrange_An_Array_With_O1_Extra_Space {

    public static void main(String[] args) {
        long[] arr={1,2};
        arrange(arr,arr.length);
    }
    static void arrange(long[] arr, int n)
    {
        // your code here
        for(int i=0;i<n;i++){
            arr[i]=arr[(int) arr[i]];
        }
    }

}
