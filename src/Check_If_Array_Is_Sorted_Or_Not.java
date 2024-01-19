public class Check_If_Array_Is_Sorted_Or_Not {
    public static void main(String[] args) {
        int[] arr={10,20,30,90,50};
        Check_If_Array_Is_Sorted_Or_Not c=new Check_If_Array_Is_Sorted_Or_Not();
        System.out.println(c.arraySortedOrNot(arr,arr.length));
    }
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
