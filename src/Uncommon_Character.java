import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Uncommon_Character {
    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "geeksquiz";
        Uncommon_Character uc=new Uncommon_Character();
        System.out.println(uc.UncommonChars(a,b));
    }

    String UncommonChars(String A, String B) {
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0;i<A.length();i++){
            hs1.add(A.charAt(i));
        }
        for(int i=0;i<B.length();i++){
            hs2.add(B.charAt(i));
        }
        for(char c : hs1){
            if(!hs2.contains(c)){
                arr.add(c);
            }
        }
        for(char c : hs2){
            if(!hs1.contains(c)){
                arr.add(c);
            }
        }
        if(arr.size() == 0){
            return "-1";
        }
        Collections.sort(arr);
        StringBuilder ans =new StringBuilder();
        for(char i : arr){
            ans.append(i);
        }
        return ans.toString();
    }



}