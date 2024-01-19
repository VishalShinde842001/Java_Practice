import java.util.Stack;

public class Reverse_String_Using_Stack {
    public static void main(String[] args) {
        String str="Vishal";
        Reverse_String_Using_Stack r=new Reverse_String_Using_Stack();
        System.out.println(r.reverse(str));
    }
    public String reverse(String S){
        if(S.length()==1){
            return S;
        }
        char[] ch=S.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<ch.length;i++){
            stack.push(ch[i]);
        }
        char[] ch1=new char[ch.length];
        for(int i=0;i<ch.length;i++){
            ch1[i]=stack.pop();
        }
        return new String(ch1);
    }
}
