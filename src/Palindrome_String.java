public class Palindrome_String {
    public static void main(String[] args) {
        String str="abba";
        Palindrome_String p=new Palindrome_String();
        System.out.println(p.isPalindrome(str));
    }
    int isPalindrome(String S) {
        StringBuilder s=new StringBuilder(S);
        s.reverse();
        String s1=s.toString();
        if(S.equals(s1)){
            return 1;
        }
        else return 0;
    }
}
