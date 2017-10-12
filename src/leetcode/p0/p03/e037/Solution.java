package leetcode.p0.p03.e037;


/**
 * Created by kunmiao.yang on 2017/5/27.
 */
import java.util.*;
public class Solution {
    public void solveSudoku(char[][] board) {
        UnknownCell[][] unknown = new UnknownCell[9][9];
        LinkedList<UnknownCell> unknownList = new LinkedList<>();
        List<Character> all = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9');
        for(int i = 0; i<9; i++) for(int j = 0; j<9; j++) if(board[i][j] == '.') {
            unknown[i][j] = new UnknownCell(all,i,j);
            unknownList.add(unknown[i][j]);
        }
        for(int i = 0; i<9; i++) for(int j = 0; j<9; j++) if(board[i][j] != '.') pruneCell(board, unknown, i, j);
        trySolver(board, unknown, unknownList);
    }
    boolean trySolver(char[][] board, UnknownCell[][] unknown, LinkedList<UnknownCell> unknownList) {
        if(!prune(board, unknown, unknownList)) return false;
        if(!unknownList.isEmpty()) {
            UnknownCell unknownCell = unknownList.pop();
            unknown[unknownCell.i][unknownCell.j] = null;
            for(Character c: unknownCell) {
                char[][] boardClone = new char[9][9];
                UnknownCell[][] unknownClone = new UnknownCell[9][9];
                LinkedList<UnknownCell> unknownListClone = new LinkedList<>();
                for(int i = 0; i<9; i++) System.arraycopy(board[i], 0, boardClone[i], 0, 9);
                for(UnknownCell cell: unknownList) {
                    UnknownCell cellClone = (UnknownCell) cell.clone();
                    unknownListClone.add(cellClone);
                    unknownClone[cellClone.i][cellClone.j] = cellClone;
                }
                boardClone[unknownCell.i][unknownCell.j] = c;
                pruneCell(boardClone, unknownClone, unknownCell.i, unknownCell.j);
                if(trySolver(boardClone, unknownClone, unknownListClone)) {
                    for(int i = 0; i<9; i++) System.arraycopy(boardClone[i], 0, board[i], 0, 9);
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    boolean prune(char[][] board, UnknownCell[][] unknown, LinkedList<UnknownCell> unknownList) {
        boolean isChanged = true;
        while (!unknownList.isEmpty() && isChanged) {
            isChanged = false;
            for(int i = 0; i<unknownList.size(); i++) {
                UnknownCell unknownCell = unknownList.pop();
                if(unknownCell.size() < 2) {
                    if(unknownCell.isEmpty()) return false;
                    board[unknownCell.i][unknownCell.j] = unknownCell.iterator().next();
                    unknown[unknownCell.i][unknownCell.j] = null;
                    isChanged = true;
                    pruneCell(board, unknown, unknownCell.i, unknownCell.j);
                } else unknownList.add(unknownCell);
            }
        }
        return true;
    }
    void pruneCell(char[][] board, UnknownCell[][] unknown, int i, int j) {
        for(int k = 0; k<9; k++) {
            if(null != unknown[i][k]) unknown[i][k].remove(board[i][j]);
            if(null != unknown[k][j]) unknown[k][j].remove(board[i][j]);
        }
        int iStart = i-i%3, jStart = j-j%3;
        for(int k = iStart; k<iStart+3; k++) for(int l = jStart; l<jStart+3; l++) if(null != unknown[k][l]) unknown[k][l].remove(board[i][j]);
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
