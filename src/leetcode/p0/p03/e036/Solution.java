package leetcode.p0.p03.e036;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++) for(int j = 0; j<9; j++) if(board[i][j] != '.') {
            for(int k = i+1; k<9; k++) if(board[i][j] == board[k][j]) return false;
            for(int k = j+1; k<9; k++) if(board[i][j] == board[i][k]) return false;
            int iStart = i-i%3, iEnd = iStart+3, jEnd = j-j%3+3;
            for(int k = i+1; k<iEnd; k++) if(board[i][j] == board[k][j]) return false;
            for(int k = iStart; k<iEnd; k++) for(int l = j+1; l<jEnd; l++) if(board[i][j] == board[k][l]) return false;
        }
        return true;
    }
}