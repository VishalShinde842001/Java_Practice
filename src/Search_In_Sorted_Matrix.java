public class Search_In_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{ 3, 30, 38},
            {36, 43, 60},
            {40, 51, 69}};
        System.out.println(search(matrix, matrix.length, matrix[0].length,43));
    }
    static boolean search(int[][] matrix, int n, int m, int x)
    {
        for(int i=0;i<n;i++){
            if(matrix[i][0]>x){
                break;
            }
            for(int j=0;j<m;j++){
               if(matrix[i][j]==x){
                   return true;
               }
            }
        }
        return false;
    }
}
