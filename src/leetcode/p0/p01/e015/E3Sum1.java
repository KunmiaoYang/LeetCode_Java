package leetcode.p0.p01.e015;

import java.util.*;

/**
 *
 * Created by yang on 2017/5/4.
 */
public class E3Sum1 {
    public static void main(String[] args) {
        int sCount = 1000;
        int range = 1000;
        Random random = new Random();
        int[] S = new int[sCount];
        for(int i = 0; i < sCount; i++) S[i] = range - random.nextInt(2 * range);

        long startTime=System.currentTimeMillis();
        Set<List<Integer>> triplets = findCombinations(S, 0, 0, 3);
//        List triplets = threeSum(S);
//        Arrays.sort(S);
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("Triplets: " + triplets);
        System.out.println("Triplets counts: " + triplets.size());
        System.out.println("Time span: "+(endTime-startTime)+"ms");
    }

    public static Set<List<Integer>> findCombinations(int[] array, int start, int targetSum, int count) {
        Set<List<Integer>> combinations;

        // if combination count is 1
        if(count < 2) {
            combinations = new LinkedHashSet<>();
            for(int i = start; i<array.length; i++) {
                if(targetSum==array[i]) {
                    combinations.add(new ArrayList<>(Collections.singletonList(targetSum)));
                    break;
                }
            }
            return combinations;
        }

        // if there is not enough elements
        if(array.length < start + count) return new LinkedHashSet<>();

        // recursive to find combinations without element array[start]
        combinations = findCombinations(array, start + 1, targetSum, count);

        // recursive to find sub combinations and add element array[start] to it
        Set<List<Integer>> subCombinations = findCombinations(array, start + 1, targetSum - array[start], count - 1);
        for(List<Integer> combination: subCombinations) {
            combination.add(array[start]);
            Collections.sort(combination);       // Sort to avoid duplicate combinations in the set
            combinations.add(combination);
        }

        return combinations;
    }

    public static List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
