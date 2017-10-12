package algorithms.p1.p10.e102;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Solution0 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        HashMap<Integer, List<Integer>> resMap = new HashMap<>();
        if(null != root) traverse(resMap, root, 0);
        return new ArrayList<>(resMap.values());
    }
    public void traverse(HashMap<Integer, List<Integer>> resMap, TreeNode root, int level) {
        List<Integer> list = resMap.get(level);
        if(null == list) {
            list = new LinkedList<>();
            resMap.put(level, list);
        }
        list.add(root.val);
        if(null != root.left) traverse(resMap, root.left, level + 1);
        if(null != root.right) traverse(resMap, root.right, level + 1);
    }
}