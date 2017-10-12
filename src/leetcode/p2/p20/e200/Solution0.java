package leetcode.p2.p20.e200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * Created by kunmiao.yang on 2017/6/5.
 */
public class Solution0 {
    public int numIslands(char[][] grid) {
        if(null == grid || 0 == grid.length) return 0;
        int m = grid.length, n = grid[0].length, group = 0;
        Set<Character> islands = new HashSet<>();
        HashMap<Character, Set<Character>> islandMap = new HashMap<>();
        for(int i = 0; i<m; i++) for(int j = 0; j<n; j++) {
            if('0' == grid[i][j]) continue;
            boolean upConnect = i>0 && '0' != grid[i-1][j], leftConnect = j>0 && '0' != grid[i][j-1];
            if(!(upConnect || leftConnect)) {
                grid[i][j] += group++;
                islands.add(grid[i][j]);
                Set<Character> groupSet = new HashSet<>();
                groupSet.add(grid[i][j]);
                islandMap.put(grid[i][j], groupSet);
            } else if(upConnect && leftConnect) {
                grid[i][j] = grid[i][j-1];
                if(grid[i-1][j] != grid[i][j-1]) {
                    Set<Character> upGroutSet = islandMap.get(grid[i-1][j]), leftGroutSet = islandMap.get(grid[i][j-1]);
                    leftGroutSet.addAll(upGroutSet);
                    islands.removeAll(leftGroutSet);
                    islands.add(grid[i][j]);
                    for(Character c: upGroutSet) islandMap.put(c, leftGroutSet);
                }
            } else if(upConnect) {
                grid[i][j] = grid[i-1][j];
            } else {
                grid[i][j] = grid[i][j-1];
            }
        }
        return islands.size();
    }
}