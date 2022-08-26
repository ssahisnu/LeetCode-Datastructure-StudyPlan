class Solution {
    //TC - O(numRows^2)
    //SC - O(1)
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> prevRow = null;
        for(int i=0; i<numRows; ++i) {
            ArrayList<Integer> curRow = new ArrayList<Integer>(i+1);
            for(int j=0; j<=i; j++) {
                if(j==0 || i==j)
                    curRow.add(1);
                else
                    curRow.add(prevRow.get(j)+prevRow.get(j-1));
            }
            prevRow = curRow;
            result.add(curRow);
        }
        return result;
        
        
//----------------------------------------------------------------------------------------//
        //Intuition
        // for every ith row -> there are i columns (ie every ith row has i elements)
        // for each(i=j || j==0) ->1 else (i-1)(j) + (i-1)(j-1)
        
        // 1
        // 11
        // 121
        // 1331
        
//----------------------------------------------------------------------------------------//
        
    }
}
