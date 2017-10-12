package leetcode.p0.p01.e015;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/5/4.
 */
public class E3Sum {
    public static void main(String[] args) {
        int[] S = {-1, 0, 1, 2, -1, -4};
//        S = {-1, 0, 1, -1, -1, 0, 1};
//        Set<List<Integer>> triplets = findTriplets(S, 0);
        Set<List<Integer>> triplets = findCombinations(S, 0, 0, 3);
        System.out.println("Triplets :" + triplets);
    }

    public static Set<List<Integer>> findCombinations(int[] array, int start, int targetSum, int count) {
        Set<List<Integer>> combinations;

        // if combination count is 1
        if(count < 2) {
            combinations = new LinkedHashSet<>();
            for(int i = start; i<array.length; i++) {
                if(targetSum==array[i]) {
                    combinations.add(new ArrayList<Integer>(Arrays.asList(targetSum)));
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
            Collections.sort(combination);       // Sort to avoid duplicate triplets in the set
            combinations.add(combination);
        }

        return combinations;
    }

    public static Set<List<Integer>> findTriplets(int[] array, int start) {
        Set<List<Integer>> triplets;

        // Recursive
        if(array.length < start + 3) return new LinkedHashSet<>();
        else triplets = findTriplets(array, start + 1);

        Set<List<Integer>> pairs = findPairs(array, start + 1, -array[start]);
        for(List<Integer> newTriplet: pairs) {
            newTriplet.add(array[start]);
            Collections.sort(newTriplet);       // Sort to avoid duplicate triplets in the set
            triplets.add(newTriplet);
        }

        return triplets;
    }

    public static Set<List<Integer>> findPairs(int[] array, int start, int targetSum) {
        Set<List<Integer>> pairs;

        // Recursive
        if (array.length < start + 2) return new LinkedHashSet<>();
        else pairs = findPairs(array, start + 1, targetSum);

        int iSecond = findSingle(array, start + 1, targetSum - array[start]);
        if(-1 < iSecond) {
            List<Integer> newPair = new ArrayList<>(Arrays.asList(array[start], array[iSecond]));
            Collections.sort(newPair);
            pairs.add(newPair);
        }
        return pairs;
    }

    public static int findSingle(int[] array, int start, final int target) {
        for(int i = start; i<array.length; i++) {
            if(target==array[i]) return i;
        }
        return -1;
    }
}
