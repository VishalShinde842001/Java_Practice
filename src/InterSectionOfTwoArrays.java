import java.util.ArrayList;

public class InterSectionOfTwoArrays {
    public static void main(String[] args) {
       int[] a = {89, 24, 75, 11, 23};
      int[]  b = {89, 2, 4};
        System.out.println(NumberofElementsInIntersection(a,b,a.length,b.length));
    }
    public static int NumberofElementsInIntersection(int[] a, int[] b, int n, int m) {
        ArrayList<Integer> arList=new ArrayList<>();
        for(int i=0;i<n;i++){
            arList.add(a[i]);
        }
        int count=0;
        for(int i=0;i<m;i++){
            if(arList.contains(b[i])){
                count++;
                arList.remove(b[i]);
            }
        }
        return count;
    }
}
