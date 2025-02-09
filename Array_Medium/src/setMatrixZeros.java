public class setMatrixZeros {
    public void printMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void markRow(int[][]matix, int i){
        int c = matix[0].length;
        for(int j=0;j<c;j++){
            if(matix[i][j] != 0){
                matix[i][j] = -1;
            }
        }
    }
    public void markColumns(int[][]matix, int j){
        int c = matix.length;
        for(int i=0;i<c;i++){
            if(matix[i][j] != 0){
                matix[i][j] = -1;
            }
        }
    }

    public void bruteForce(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 0){
                    markRow(matrix, i);
                    markColumns(matrix, j);
                }
            }
        }
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
        printMatrix(matrix);
    }

    public void betterApproach(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int[] row = new int[r];
        int[] col = new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
        printMatrix(matrix);
    }

    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int col0 = 1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if (j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }
         for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }if(matrix[0][0] == 0){
            for (int j=0;j<c;j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0;i<r;i++){
                matrix[i][0] =0;
            }
        }
        printMatrix(matrix);

    }

    public static void main(String[] args) {
        setMatrixZeros smz = new setMatrixZeros();
        int[][] arr = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        smz.bruteForce(arr);
//        smz.betterApproach(arr);
        smz.setZeroes(arr);
    }
}
