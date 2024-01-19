import java.util.HashSet;
import java.util.Set;

public class Check_If_String_Is_Isogram {
    public static void main(String[] args) {
        String s="machine";
        System.out.println(isIsogram(s));
    }
    static boolean isIsogram(String data){
        Set<Character> ch=new HashSet<>();
        ch.add(data.charAt(0));
        for(int i=1;i<data.length();i++){
            if(ch.contains(data.charAt(i))){
                return false;
            }else{
                ch.add(data.charAt(i));
            }
        }
        return true;
    }
}
