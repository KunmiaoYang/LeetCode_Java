package leetcode.p0.p00.e001;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by kunmiao.yang on 2017/5/10.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if(null!=index) return new int[]{index, i};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        int[] nums = {3,3};
        long startTime=System.currentTimeMillis();
        int[] indices = new TwoSum().twoSum(nums, 6);
        long endTime=System.currentTimeMillis(); //��ȡ����ʱ��
        System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
