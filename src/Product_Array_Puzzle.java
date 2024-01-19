public class Product_Array_Puzzle {
    public static void main(String[] args) {
        int[] nums={1,0};
        for(Long l:productExceptSelf(nums, nums.length)){
            System.out.print(l+" ");
        }
    }
    public static long[] productExceptSelf(int[] nums, int n)
    {
        long mul=1;boolean flag=false;
        int r=-1;
        long[] num=new long[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                r=i;
               flag=true;

               continue;
            }
            mul=nums[i]*mul;
        }

        for(int i=0;i<n;i++){
            if(flag){
                if(i==r){
                    num[r]=mul;
                }
               else{ num[i]=0;}
                break;
            }
            num[i]=mul/nums[i];
        }
        return num;
    }
}
