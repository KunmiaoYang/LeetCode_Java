package leetcode.p6.p62.e621;

/**
 *
 * Created by Kunmiao Yang on 11/28/2017.
 */
public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int periodCount = 0, period = n + 1, maxCount = 0, counts[] = new int[26];
        for(char c: tasks) {
            int i = c - 'A';
            maxCount = ++counts[i]>maxCount? counts[i] : maxCount;
        }
        int taskTable[] = new int[maxCount + 2];
        for(int count: counts)
            taskTable[count]++;
        for(int timeLeft = period, cur = maxCount; maxCount > 1;) {
            if(cur < 1) {
                taskTable[0] += taskTable[1];
            } else if(taskTable[cur] < timeLeft) {
                timeLeft -= taskTable[cur--];
                continue;
            } else {
                taskTable[cur - 1] += timeLeft;
                taskTable[cur] += taskTable[cur + 1] - timeLeft;
            }
            for(int i = cur + 1; i <= maxCount; i++) taskTable[i] = taskTable[i + 1];
            if(cur < maxCount) cur = --maxCount;
            periodCount++;
            timeLeft = period;
        }
        return periodCount * period + taskTable[1];
    }
}
