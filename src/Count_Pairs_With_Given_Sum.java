public class Count_Pairs_With_Given_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        Count_Pairs_With_Given_Sum c = new Count_Pairs_With_Given_Sum();
        System.out.println(c.getPairsCount(arr, arr.length, 6));
    }

    //Brute Force Approch
   int getPairsCount(int[] arr, int n, int k) {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
}
