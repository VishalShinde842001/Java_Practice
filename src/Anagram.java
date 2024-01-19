import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
       String a = "geeksforgeeks", b = "forgeeksgeeks";
        System.out.println(isAnagram(a,b));
    }
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length()){
            return false;
        }
        char[] ch=a.toCharArray();
        char[] ch1=b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<a.length();i++){
            if(ch[i]!=ch1[i]){
                return false;
            }
        }
        return true;
    }

}
