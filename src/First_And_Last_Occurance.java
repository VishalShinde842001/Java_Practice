import java.util.ArrayList;

public class First_And_Last_Occurance
{
    public static void main(String[] args) {
        First_And_Last_Occurance f=new First_And_Last_Occurance();
        long[] arr={1,3,5,5,5,5,5,5,67};
        for(Long i:f.find(arr,arr.length,5)){
            System.out.print(i+" ");
        }
    }
    ArrayList<Long> find(long[] arr, int n, int x)
    {
        boolean flag=true;
        long first=-1;
        int count=0;
        ArrayList<Long> arList=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                if(flag){first=i;flag=false;}
                count++;
            }
        }
        arList.add(first);
        if(first==-1){
            arList.add((long) -1);
        }else{
        arList.add(count+first-1);}
        return arList;
    }
}
