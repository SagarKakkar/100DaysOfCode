public class SearchA2dMatrix {
    // Step search algorithm - O(m+n) Complexity
    // The basic idea is from right corner, if the current number greater than target col - 1 in same row,
    // else if the current number less than target, row + 1 in same column, finally if they are same, 
    // we find it, and return result.
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int row=0;
        int col = matrix[0].length - 1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
