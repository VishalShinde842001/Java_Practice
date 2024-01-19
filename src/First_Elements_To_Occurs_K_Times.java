import java.util.HashMap;

public class First_Elements_To_Occurs_K_Times {
    public static void main(String[] args) {
        int[] a={1,2,3};
        First_Elements_To_Occurs_K_Times f=new First_Elements_To_Occurs_K_Times();
        System.out.println(f.firstElementKTime(a,a.length,1));
    }
    public int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
                if(hm.get(a[i])==k){
                    return a[i];
                }
            }
            else{
                hm.put(a[i],1);
                if(hm.get(a[i])==k){
                    return a[i];
                }

            }
        }

        return -1;
    }
}
