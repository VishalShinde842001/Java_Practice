public class Row_With_Max_1s {
    public static void main(String[] args) {
        int[][] Arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        Row_With_Max_1s r=new Row_With_Max_1s();
        System.out.println(r.rowWithMax1s(Arr,Arr.length,Arr[0].length));

    }
    int rowWithMax1s(int[][] arr, int n, int m) {
        int count;
        int max=0;
        int index=-1;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
                if(count>max){
                    max=count;
                    index=i;
                }

            }
        }
        return index;
    }
}