//Time exceeds

public class Minimum_Indexed_Character {
    public static void main(String[] args) {
        System.out.println(minIndexChar("hasjkhflaskdf" ,
                "sdlkjfshd"));
    }
    public static int minIndexChar(String str, String patt) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<patt.length();i++) {
            int index = str.indexOf(patt.charAt(i));
            if(index>-1) {
                mini = Math.min(index,mini);
            }
            if(index==0){
                return 0;
            }
        }
        return mini;
        }
    }



