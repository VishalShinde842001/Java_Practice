import java.util.HashMap;

public class Non_repeating_Character {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(nonrepeatingCharacter(s));
    }

    static char nonrepeatingCharacter(String S) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<S.length();i++){
            if(map.containsKey(S.charAt(i))){
                map.put(S.charAt(i),map.get(S.charAt(i))+1);
            }else{
                map.put(S.charAt(i),1);
            }
        }
        for(int i=0;i<S.length();i++){
            if(map.get(S.charAt(i))==1){
                return S.charAt(i);
            }
        }
        return '$';
    }
}
