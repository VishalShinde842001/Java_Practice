public class Search_In_Matrix {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{5,6,7}};
        System.out.println(matSearch(mat,mat.length,mat[0].length,7));
    }
    public static int matSearch(int[][] mat, int N, int M, int X)
    {
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(mat[i][j]==X){
                    return 1;
                }
            }
        }
        return 0;
    }
}
