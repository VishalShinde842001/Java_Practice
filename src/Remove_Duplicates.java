
import java.util.LinkedHashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        String str="aabbbd";
        Remove_Duplicates r=new Remove_Duplicates();
        System.out.println(r.removeDups(str));
    }
    String removeDups(String S) {
        LinkedHashSet<Character> set=new LinkedHashSet<Character>();
        char[] ch=S.toCharArray();
        String s="";
        for(int i=0;i<ch.length;i++){
            if(set.add(ch[i])){
                s=s+ch[i];
            };
        }
        return s;
    }
}
