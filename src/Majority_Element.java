import java.util.HashMap;

public class Majority_Element {
    public static void main(String[] args) {
        int[] a={3,1,3,3,2};
        System.out.println(majorityElement(a,a.length));
    }
    static int majorityElement(int[] a, int size)
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<size;i++){
            if(hmap.containsKey(a[i])){
                hmap.put(a[i],hmap.get(a[i])+1);
            }else{
                hmap.put(a[i],1);
            }
        }
        for(int i=0;i<size;i++){
            if(hmap.get(a[i])>(size/2)){
                return a[i];
            }
        }
        return -1;

    }
}
