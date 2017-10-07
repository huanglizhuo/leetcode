class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int len = m * n;
        if(len==0){
            return false;
        }
        int row=m-1,col=0;
        while(true){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                row--;
            }else {
                col++;
            }
            if(col>n-1||row<0){
                return false;
            }
        }
    }
}