

public class Sort_An_Array_0s_1s_2s {
    public static void main(String[] args) {
        int[] arr= {0 ,2, 1, 2, 0};
        sort012(arr,arr.length);
    }
    public static void sort012(int[] a, int n)
    {
        //Approch 1
        //Arrays.sort(a);
        //Approch 2
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<n;i++){
            if(a[i]==0){
               count0++;
            }
            else if(a[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int i=0;
        while(count0>0){

            a[i]=0;
            count0--;
            i++;
        }
        while(count1>0){

            a[i]=1;
            count1--;
            i++;
        }
        while(count2>0){

            a[i]=2;
            count2--;
            i++;
        }
        printArray(a);

    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
