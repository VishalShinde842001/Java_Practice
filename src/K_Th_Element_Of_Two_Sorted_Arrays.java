import java.util.ArrayList;

public class K_Th_Element_Of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        K_Th_Element_Of_Two_Sorted_Arrays k=new K_Th_Element_Of_Two_Sorted_Arrays();

        System.out.println(k.kthElement(arr1,arr2,arr1.length,arr2.length,5));
    }

    public long kthElement( int[] arr1, int[] arr2, int n, int m, int k) {

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            list2.add(arr2[i]);
        }
        list1.addAll(list2);
        list1.sort(null);
        return (long)list1.get(k-1);

    }
}
