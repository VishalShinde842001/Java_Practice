public class Move_All_Zeros_ToLast {

    public static void main(String[] args) {
        int[] arr={1,2,3,0,4};
        Move_All_Zeros_ToLast m=new Move_All_Zeros_ToLast();
        m.pushZerosToEnd(arr,arr.length);
    }
    void pushZerosToEnd(int[] arr, int n) {
        int j=0;
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                arr1[j++]=arr[i];
            }
        }

        System.arraycopy(arr1,0,arr,0,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
