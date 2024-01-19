import java.util.Arrays;

public class Two_Repeated_Elements {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4,3};
        Two_Repeated_Elements t=new Two_Repeated_Elements();

        for(Integer i:t.twoRepeated(arr,arr.length)){
            System.out.print(i+" ");
        }
    }
    public int[] twoRepeated(int[] arr, int N)
    {
        int[] ar=new int[2];
        int j=0;
        Arrays.sort(arr);
        for(int i=0;i<N-1;i++){
            if(arr[i]==ar[i+1]){

                ar[j++]=arr[i];

            }
        }
        return ar;
    }
}
