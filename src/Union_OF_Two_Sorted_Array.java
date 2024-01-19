import java.util.ArrayList;

import java.util.LinkedHashSet;

public class Union_OF_Two_Sorted_Array {
    public static void main(String[] args) {
        int []arr1 = {1, 2, 3, 4, 5};
        int[] arr2  = {1, 2, 3};
        for(Integer i:findUnion(arr1,arr2,arr1.length,arr2.length)){
            System.out.println(i+" ");
        }
    }
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m)
    {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        list.sort(null);
        return list;
    }
}
