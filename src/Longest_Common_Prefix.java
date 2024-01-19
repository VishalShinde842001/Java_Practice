import java.util.Arrays;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
       String[] arr= {"geeksforgeeks", "geeks", "geek",
                "geezer"};
       Longest_Common_Prefix l=new Longest_Common_Prefix();
        System.out.println(l.longestCommonPrefix(arr,arr.length));
    }
    String longestCommonPrefix(String[] arr, int n){
        Arrays.sort(arr);
        int length=arr[0].length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<length;i++){
            if(arr[0].charAt(i)!=arr[n-1].charAt(i)){
                break;}
            sb.append(arr[0].charAt(i));
        }
        String s=sb.toString();
        if(s.length()==0){
            return "-1";
        }
        return s;
    }
}
