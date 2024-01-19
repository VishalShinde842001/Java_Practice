public class Count_Palindrome_Sub_Strings_Of_A_String {
    public static void main(String[] args) {
        String str="abaab";
        Count_Palindrome_Sub_Strings_Of_A_String c=new Count_Palindrome_Sub_Strings_Of_A_String();
        System.out.println(c.CountPS(str,str.length()));
    }
    public boolean palindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;

    }

    public int CountPS(String S, int N)
    {
        //code here
        int pal=0;
        for(int i=0;i<N;i++){
            for(int j=i+2;j<=N;j++)
            {
                String str=S.substring(i,j);
                if(palindrome(str) && str.length() >= 2) {pal++;}
            }
        }
        return pal;
    }

}
