

public class Kadane_Algorithm {
    public static void main(String[] args) {
        int[] arr={1,2,3,-2,5};
        Kadane_Algorithm k=new Kadane_Algorithm();
        System.out.println(k.maxSubarraySum(arr,arr.length));
    }
    long maxSubarraySum(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }


}
