package leetcode.p0.p03.e036;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Solution0 {
    public boolean isValidSudoku(char[][] board) {
        boolean isChanged = true;
        UnknownCell[][] unknown = new UnknownCell[9][9];
        LinkedList<UnknownCell> unknownList = new LinkedList<>();
        List<Character> all = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9');
        for(int i = 0; i<9; i++) for(int j = 0; j<9; j++) if(board[i][j] == '.') {
            unknown[i][j] = new UnknownCell(all,i,j);
            unknownList.add(unknown[i][j]);
        }
        for(int i = 0; i<9; i++) for(int j = 0; j<9; j++) if(board[i][j] != '.') {
            for(int k = 0; k<9; k++) {
                if(null != unknown[i][k]) unknown[i][k].remove(board[i][j]);
                if(null != unknown[k][j]) unknown[k][j].remove(board[i][j]);
            }
            int iStart = i-i%3, jStart = j-j%3;
            for(int k = iStart; k<iStart+3; k++) for(int l = jStart; l<jStart+3; l++) if(null != unknown[k][l]) unknown[k][l].remove(board[i][j]);
        }
        while (!unknownList.isEmpty() && isChanged) {
            isChanged = false;
            for(int i = 0; i<unknownList.size(); i++) {
                UnknownCell unknownCell = unknownList.pop();
                if(unknownCell.size() < 2) {
                    if(unknownCell.isEmpty()) return false;
                    board[unknownCell.i][unknownCell.j] = unknownCell.iterator().next();
                    unknown[unknownCell.i][unknownCell.j] = null;
                    isChanged = true;
                    for(int k = 0; k<9; k++) {
                        if(null != unknown[unknownCell.i][k]) unknown[unknownCell.i][k].remove(board[unknownCell.i][unknownCell.j]);
                        if(null != unknown[k][unknownCell.j]) unknown[k][unknownCell.j].remove(board[unknownCell.i][unknownCell.j]);
                    }
                    int iStart = unknownCell.i-unknownCell.i%3, jStart = unknownCell.j-unknownCell.j%3;
                    for(int k = iStart; k<iStart+3; k++) for(int l = jStart; l<jStart+3; l++) if(null != unknown[k][l]) unknown[k][l].remove(board[unknownCell.i][unknownCell.j]);
                } else unknownList.add(unknownCell);
            }
        }
        if(!unknownList.isEmpty()) {
            UnknownCell unknownCell = unknownList.pop();
            for(Character c: unknownCell) {
                board[unknownCell.i][unknownCell.j] = c;
                if(isValidSudoku(board.clone())) return true;
            }
            return false;
        }
        return true;
    }
    public static class UnknownCell extends HashSet<Character> {
        int i, j;
        public UnknownCell(Collection<? extends Character> c, int i, int j) {
            super(c);
            this.i = i;
            this.j = j;
        }
    }
}