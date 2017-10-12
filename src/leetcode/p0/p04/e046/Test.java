package leetcode.p0.p04.e046;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kunmiao.yang on 2017/5/26.
 */
public class Test {
    public static void test() {
        int[] input;
        long startTime, endTime;
        List<List<Integer>> res;

        input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().permute(input);
        endTime=System.currentTimeMillis();
//        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        Set<List<Integer>> set1 = new HashSet<>(res);

//        input = new int[]{1, 2, 3, 4};
//        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution3().permute(input);
        endTime=System.currentTimeMillis();
//        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        Set<List<Integer>> set2 = new HashSet<>(res);
        System.out.println("Result = " + (set1.size() - set2.size()));
    }
}
