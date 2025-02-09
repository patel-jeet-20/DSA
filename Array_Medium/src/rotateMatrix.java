public class rotateMatrix {
    static void printMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void bruteForce(int[][] matrx){
        int r = matrx.length;
        int c = matrx[0].length;
        int n = matrx.length;
        int[][] ansMatrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ansMatrix[j][n-i-1] = matrx[i][j];
            }
        }
        printMatrix(ansMatrix);
    }

    public static void rotate(int[][] matrix) {
        int r = matrix.length;
        for (int i = 0; i < r - 2; i++) {
            for (int j = i; j < r; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<r;i++){
            for(int j= 0;j<matrix[0].length/2;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][r-j-1];
                matrix[i][r-j-1] = temp;
            }
        }
        printMatrix(matrix);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        bruteForce(matrix);
        rotate(matrix);
    }
}
