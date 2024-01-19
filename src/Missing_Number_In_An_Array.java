//This is GFG Easy Problem
//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing
// element.
public class Missing_Number_In_An_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        Missing_Number_In_An_Array m=new Missing_Number_In_An_Array();
        System.out.println(m.missingNumber(arr, arr.length+1));
    }
    int missingNumber(int[] array, int n) {
        int expectedSum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+array[i];
        }
        if((expectedSum-sum)==0)return -1;
        else{
            return expectedSum-sum;
        }
    }
}