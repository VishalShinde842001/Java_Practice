import java.util.ArrayList;
public class Move_All_Negative_To_End {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        Move_All_Negative_To_End m=new Move_All_Negative_To_End();
        m.segregateElements(arr,arr.length);
    }
    public void segregateElements(int[] arr, int n)
    {
        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ar1.add(arr[i]);
            }
            else{
                ar2.add(arr[i]);
            }
        }
       ar1.addAll(ar2);

        Object[] object;
object= ar1.toArray();
for(int i=0;i<n;i++){
    arr[i]= (int) object[i];
}

        /*for(int i=0;i<n;i++){
            System.out.print(object[i]+" ");
        }*/
    }
}
