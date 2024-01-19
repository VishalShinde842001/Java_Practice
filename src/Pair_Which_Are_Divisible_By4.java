public class Pair_Which_Are_Divisible_By4 {
    public static void main(String[] args) {
        int[] arr={2,2,1,7,5};
        System.out.println(count4Divisibiles(arr,arr.length));
    }
    public static int count4Divisibiles(int[] arr, int n )
    {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])%4==0){
                    count++;
                }
            }
        }
        return count;
    }

}
