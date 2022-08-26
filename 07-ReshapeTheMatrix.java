class Solution {
    //TC - O(r*c)
    //SC- O(1)
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int matR = mat.length;
        int matC = mat[0].length;
        
        if(matR*matC != r*c) return mat;
        if(matR==r && matC==c) return mat;
        
        int[][] res = new int[r][c];
        int iter1=0, iter2=0;
        for(int i=0; i<r; ++i){
            for(int j=0; j<c; ++j){
                if(iter2==matC){
                    iter1++;
                    iter2=0;
                }
                res[i][j] = mat[iter1][iter2++];
            }
        }
        return res;
        
    }
}
