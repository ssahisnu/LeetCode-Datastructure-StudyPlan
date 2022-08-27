class Solution {
    //TC - O(9*9)
    //SC - O(3*9*9)
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                
                if (board[i][j] != '.') {
                    StringBuilder sb = new StringBuilder();
                    
                    sb.append(i).append('<').append(board[i][j]);
                    String row = sb.toString();
                    if(seen.contains(row))
                        return false;
                    seen.add(row);
                    
                    
                    sb.deleteCharAt(0);
                    sb.deleteCharAt(0);
                    sb.append('>').append(j);
                    String box = sb.toString();
                    if(seen.contains(box))
                        return false;
                    seen.add(box);
                    sb = new StringBuilder();
                    
                    sb.append(i/3).append('<').append(board[i][j]).append('>').append(j/3);
                    String col = sb.toString();
                    if(seen.contains(col))
                        return false;
                    seen.add(col);
                    
                }
            }
        }
        return true;
    }
}
