public class Longest_Coomon_SubString {

    public static void main(String[] args) {
        String s1="ABC";
        String s2="ACB";
        Longest_Coomon_SubString l=new Longest_Coomon_SubString();
        System.out.println(l.longestCommonSubstr(s1,s2,s1.length(),s2.length()));
    }

    int longestCommonSubstr(String S1, String S2, int n, int m) {

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                String str=S1.substring(i,j+1);
                if(S2.contains(str)){
                    maxi=Math.max(maxi,str.length());
                }
            }
        }
        return maxi;
    }

}
