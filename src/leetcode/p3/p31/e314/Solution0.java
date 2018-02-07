package leetcode.p3.p31.e314;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 11/29/2017.
 */
public class Solution0 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, root);
        return result;
    }
    private int[] dfs(List<List<Integer>> result, TreeNode root) {
        if(null == root) return new int[]{-1, 0};
        List<List<Integer>> leftList = new ArrayList<>(), rightList = new ArrayList<>();
        int left[] = dfs(leftList, root.left), right[] = dfs(rightList, root.right),
                rootPos = Math.max(left[0] + 1, right[0] - 1);
        if(left[0] > -1) {
            if(left[0] + 1 == left[1]) {
                List<Integer> rootList = new LinkedList<>();
                rootList.add(root.val);
                leftList.add(rootList);
            } else {
                ((LinkedList<Integer>) leftList.get(left[0] + 1)).push(root.val);
            }
            if(right[0] > -1) {
                int pos;
                if((pos = left[0] + 2 - right[0]) > 0) {
                    result = mergeList(leftList, rightList, pos);
                } else result = mergeList(rightList, leftList, -pos);
            } else result = leftList;
        } else {
            if(right[0] > -1) {
                if(right[0] == 0) {
                    List<Integer> rootList = new LinkedList<>();
                    rootList.add(root.val);
                    result = new ArrayList(rightList.size() + 1);
                    result.add(rootList);
                    result.addAll(rightList);
                } else {
                    result = rightList;
                    ((LinkedList<Integer>) result.get(right[0] - 1)).push(root.val);
                }
            } else {
                List<Integer> rootList = new LinkedList<>();
                rootList.add(root.val);
                result = new ArrayList<>();
                result.add(rootList);
            }
        }
        return new int[]{rootPos, result.size()};
    }
    private List<List<Integer>> mergeList(List<List<Integer>> base, List<List<Integer>> add, int pos) {
        if(base.size() < add.size() + pos) {
            List<List<Integer>> result = new ArrayList<>(add.size() + pos);
            result.addAll(base);
            for(int i = pos; i < base.size(); i++) result.get(i).addAll(add.get(i - pos));
            for(int i = base.size() - pos; i < add.size(); i++) result.add(add.get(i));
            return result;
        } else {
            for(int i = pos, j = 0; j < add.size(); i++, j++) base.get(i).addAll(add.get(j));
            return base;
        }
    }
}
