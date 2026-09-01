class Solution {
    public boolean isValidSudoku(char[][] board) {
        // brute force
        boolean ans = true;
        // check the rows
        for (int i = 0; i < board.length; i++) {
            ans = CheckForDuplicates(board, i, i, 0, board[0].length - 1);
            if (ans == false) {
                return ans;
            }
        }

        // ceck the columns
        for (int i = 0; i < board.length; i++) {
            ans = CheckForDuplicates(board, 0, board[0].length - 1, i, i);
            if (ans == false) {
                return ans;
            }
        }

        // check the grids

        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board[0].length; j = j + 3) {
                ans = CheckForDuplicates(board, i, i + 2, j, j + 2);

                if (ans == false) {
                    return ans;
                }
            }
        }
        return ans;
    }

    public boolean CheckForDuplicates(
        char[][] board, int rowStart, int rowEnd, int colStart, int colEnd) {
        Hashtable<Character, Integer> table = new Hashtable<>();

        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                char current = board[i][j];
                   // Ignore empty cells
                if (current == '.') {
                    continue;
                }
                if (table.containsKey(current)) {
                    return false; // duplicate found
                }

                table.put(current, 1); // remember this character
            }
        }

        return true; // no duplicates
    }
}
