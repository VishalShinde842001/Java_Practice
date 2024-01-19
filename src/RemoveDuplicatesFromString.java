
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        RemoveDuplicatesFromString r=new RemoveDuplicatesFromString();
        System.out.println(r.removeDuplicates(str));
    }
   String removeDuplicates(String str) {
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }
        return sb.toString();
    }}
