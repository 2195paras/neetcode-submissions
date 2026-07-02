class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> row = new HashSet<>();

    //check every row element
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
if(board[i][j]=='.'){
  continue;
}
        if (row.contains(board[i][j]+"at row"+i) ||
            (row.contains(board[i][j]+"at col"+j)) ||
            (row.contains(board[i][j]+"at sq"+i/3+j/3))) {
          return false;
        } else {
          row.add(board[i][j]+"at row"+i);
          row.add(board[i][j]+"at col"+j);
          row.add(board[i][j]+"at sq"+i/3+j/3);
        }
      }
    }
    return true;  
    }
}
