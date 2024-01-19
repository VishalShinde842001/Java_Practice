import java.util.HashSet;
import java.util.Set;

public class Find_First_Repeated_Charcter {
    public static void main(String[] args) {
        String s="abc";
        Find_First_Repeated_Charcter f=new Find_First_Repeated_Charcter();
        System.out.println(f.firstRepChar(s));
    }
    String firstRepChar(String s)
    {
        Set<Character> ch=new HashSet<>();
        ch.add(s.charAt(0));
        String str="";
        for(int i=1;i<s.length();i++){
            if(ch.contains(s.charAt(i))){
                return str+s.charAt(i);
            }
            ch.add(s.charAt(i));
        }
        return "-1";

    }
}
