
import java.util.HashSet;

public class Min_Indexed_Charcter {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        String patt="set";
        System.out.println(minIndexChar(str,patt));
    }
    public static int minIndexChar(String str, String patt)
    {
        HashSet<Character> hset=new HashSet<>();
        for(int i=0;i<patt.length();i++){
            hset.add(patt.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            if(hset.contains(str.charAt(i))){
                return i;
            }
        }
        return -1;

    }
}
