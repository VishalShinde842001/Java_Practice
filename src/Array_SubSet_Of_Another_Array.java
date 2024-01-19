import java.util.Arrays;

public class Array_SubSet_Of_Another_Array {
    public static void main(String[] args) {
       long[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        long[] a2 = {11, 3, 7, 1, 7};
        Array_SubSet_Of_Another_Array a=new Array_SubSet_Of_Another_Array();
        System.out.println(a.isSubset(a1,a2,a1.length,a2.length));
    }
    public String isSubset( long[] a1, long[] a2, long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(n<m){
            return "No";
        }
        boolean flag=false;
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(a1[i]==a2[j]){
                i++;
                j++;
                flag =true;
            }
            else if(a1[i]!=a2[j]) {
                i++;
                flag =false;
            }
        }
        if(flag){
            return "Yes";
        }
        return "No";

    }
}
