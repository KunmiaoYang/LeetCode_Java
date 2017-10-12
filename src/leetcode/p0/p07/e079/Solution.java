package leetcode.p0.p07.e079;

/**
 *
 * Created by kunmiao.yang on 2017/6/19.
 */
public class Solution {
    int m, n, last;
    public boolean exist(char[][] board, String word) {
        last = word.length() - 1;
        if(-1 == last) return true;
        m = board.length;
        if(0 == m) return false;
        n = board[0].length;
        boolean[][] used = new boolean[m][n];
        for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) if(exist(board, i, j, word, 0, used)) return true;
        return false;
    }
    boolean exist(char[][] board, int i, int j, String word, int k, boolean[][] used) {
        if(used[i][j] || board[i][j] != word.charAt(k)) return false;
        if(k == last) return true;
        used[i][j] = true;
        boolean res = (i > 0 && exist(board, i - 1, j, word, k + 1, used)) ||
                (i < m - 1 && exist(board, i + 1, j, word, k + 1, used)) ||
                (j > 0 && exist(board, i, j - 1, word, k + 1, used)) ||
                (j < n - 1 && exist(board, i, j + 1, word, k + 1, used));
        used[i][j] = false;
        return res;
    }
}