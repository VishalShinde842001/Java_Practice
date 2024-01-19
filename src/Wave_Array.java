public class Wave_Array {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       convertToWave(arr.length,arr);
    }
    public static void convertToWave(int n, int[] a) {
        for(int i=0;i<n-1;i=i+2){
            if(a[i]<a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
