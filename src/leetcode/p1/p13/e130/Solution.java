package leetcode.p1.p13.e130;

/**
 *
 * Created by Kunmiao Yang on 11/14/2017.
 */
public class Solution {
    int head = 0, tail = 0, m, n, queueX[], queueY[];
    boolean flag[][];
    char board[][];
    public void solve(char[][] board) {
        m = board.length;
        if(3 > m) return;
        n = board[0].length;
        if(3 > n) return;
        this.board = board;
        flag = new boolean[m][n];
        queueX = new int[m*n];
        queueY = new int[m*n];
        for(int i = 0; i < n; i++) {
            if('O' == board[0][i]) add(0, i);
            if('O' == board[m - 1][i]) add(m - 1, i);
        }
        for(int j = 1; j < m - 1; j++) {
            if('O' == board[j][0]) add(j, 0);
            if('O' == board[j][n - 1]) add(j, n - 1);
        }
        while(tail < head) {
            int x = queueX[tail], y = queueY[tail++];
            if(isValid(x - 1, y)) add(x - 1, y);
            if(isValid(x + 1, y)) add(x + 1, y);
            if(isValid(x, y - 1)) add(x, y - 1);
            if(isValid(x, y + 1)) add(x, y + 1);
        }
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if('O' == board[i][j] && !flag[i][j]) board[i][j] = 'X';
    }
    private void add(int x, int y) {
        flag[x][y] = true;
        queueX[head] = x;
        queueY[head++] = y;
    }
    private boolean isValid(int x, int y) {
        return x > -1 && y > -1 && x < m && y < n && 'O' == board[x][y] && !flag[x][y];
    }
}
