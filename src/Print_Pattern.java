import java.util.ArrayList;
import java.util.List;
public class Print_Pattern {
    public static void main(String[] args) {
        for(Integer i:pattern(16)){
            System.out.print(i+" ");
        }
    }
    static List<Integer> pattern(int N){
        List<Integer> list=new ArrayList<>();
        list.add(N);
        while(N>0){
            N=N-5;list.add(N);
        }
        int a=list.size();
        while(a>1){
         N=N+5;
         list.add(N);
            a--;
        }
        return list;
    }
}
