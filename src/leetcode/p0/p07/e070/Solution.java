package leetcode.p0.p07.e070;

/**
 *
 * Created by admin on 2017/6/19.
 */
public class Solution {
    public int climbStairs(int n) {
        int i = n + 1;
        // Calculate Fibonacci number
        double sqrt5 = Math.sqrt(5);
         return (int) Math.round((Math.pow((1 + sqrt5) / 2, i) - Math.pow((1 - sqrt5) / 2, i)) / sqrt5);
    }
}