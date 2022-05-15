class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int start = 0;
        int end =  (matrix.length * matrix[0].length ) - 1;
        int div = matrix[0].length;
        
        while(start <= end) {
            int mid = (start + end)/2;
            
            if(matrix[mid/div][mid % div] == target) {
                return true;
            } else {
                if(matrix[mid/div][mid % div] > target) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
            
        }
        
        return false;
        
    }
}
