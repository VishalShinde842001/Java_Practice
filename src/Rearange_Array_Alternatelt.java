import java.util.ArrayList;

public class Rearange_Array_Alternatelt {
    public static void main(String[] args) {
        long[] arr = {10,20,30,40,50,60,70,80,90,100,110};
        rearrange(arr,arr.length);

    }
    public static void rearrange(long[] arr, int n){
        ArrayList<Long> list=new ArrayList<>();
        for(int i=0;i<(n/2)+1;i++){
            list.add(arr[n-i-1]);
            list.add(arr[i]);
        }
        if(list.size()-arr.length==1){
           list.remove(list.size()-1);
        }else if(list.size()-arr.length==2){
            list.remove(list.size()-1);
            list.remove(list.size()-2);
        }
      for(int i=0;i<n;i++){
          arr[i]=list.get(i);
      }
      /*for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
      }*/

    }
}
