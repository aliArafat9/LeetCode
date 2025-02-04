class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (backtrack(board, word, 0, i, j)) return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, int currIndex, int row, int column) {
        if (currIndex == word.length()) return true;

        if (currIndex >= word.length() || row < 0 || column < 0 || row >= board.length || column >= board[0].length || word.charAt(currIndex) != board[row][column]) 
            return false;
        
        char temp = board[row][column];
        board[row][column] = '*';
        boolean res = backtrack(board, word, currIndex + 1, row + 1, column) ||
                      backtrack(board, word, currIndex + 1, row - 1, column) ||
                      backtrack(board, word, currIndex + 1, row, column + 1) ||
                      backtrack(board, word, currIndex + 1, row, column - 1);
        board[row][column] = temp;
        return res;
    }
}