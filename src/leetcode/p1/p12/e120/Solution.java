package leetcode.p1.p12.e120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by admin on 2017/5/6.
 */
public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(1)));
        triangle.add(new ArrayList<>(Arrays.asList(1, 100)));
        triangle.add(new ArrayList<>(Arrays.asList(1, 1000, 100)));
        triangle.add(new ArrayList<>(Arrays.asList(1, 1000, -200, 100)));

        int min = new Solution().minimumTotal(triangle);
        System.out.println("Solution = " + min);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
    int[] arr = new int[triangle.size() + 1];
    for (int i = triangle.size() - 1; i >= 0; i--)
        for (int j = 0; j <= i; j++)
            arr[j] = Math.min(arr[j], arr[j + 1]) + triangle.get(i).get(j);
    return arr[0];
}
}
