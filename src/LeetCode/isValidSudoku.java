package LeetCode;
import java.util.*;

class isValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                char current = board[i][j];
                if(current != '.'){
                    if(!seen.add(current + " found in row " + i) || !seen.add(current + " found in column " + j) || !seen.add(current + " found in sub grid " + i/3 + "-" + j/3) ) return false;
                }
            }
        }
        return true;
    }
}