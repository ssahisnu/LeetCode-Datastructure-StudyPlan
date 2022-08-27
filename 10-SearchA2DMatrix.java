class Solution {
    //TC - O(log(row*col))
    //SC - O(1)
    public boolean searchMatrix(int[][] matrix, int target){
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        int l=0;
        int h=(r*c)-1;
        
        while(l<=h){
            int mid = l + (h-l)/2;
            int row = mid/c;
            int col = mid%c;
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]<target)
                l = mid+1;
            else
                h = mid-1;
        }
        
        return false;
    }
}
