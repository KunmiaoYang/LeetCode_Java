package leetcode.p0.p01.e015;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/5/4.
 */
public class E3Sum0 {
    public static void main(String[] args) {
        Set<Integer> p1 = new HashSet<>(Arrays.asList(1, 2)),
                p2 = new HashSet<>(Arrays.asList(2, 2, 1));
        Set<Set<Integer>> set = new LinkedHashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println("Set size: " + set.size());
    }

    public static Set<List<Integer>> findTriplets(int[] array, int start) {
        Set<List<Integer>> triplets;

        // Recursive
        if(array.length < start + 3) return new LinkedHashSet<>();
        else triplets = findTriplets(array, start + 1);

        Set<List<Integer>> pairs = findPairs(array, start + 1, -array[start]);
        for(List<Integer> newTriplet: pairs) {
            newTriplet.add(array[start]);
            Collections.sort(newTriplet);

            boolean duplicate = false;
            for(List<Integer> triplet: triplets) {
                if (triplet.get(0).equals(newTriplet.get(0)) && triplet.get(1).equals(newTriplet.get(0))) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) triplets.add(newTriplet);
        }

        return triplets;
    }

    public static Set<List<Integer>> findPairs(int[] array, int start, int targetSum) {
        Set<List<Integer>> pairs;

        // Recursive
        if(array.length < start + 2) return new LinkedHashSet<>();
        else pairs = findPairs(array, start + 1, targetSum);

        int iSecond = findSingle(array, start + 1, targetSum - array[start]);
        if(-1 < iSecond) {
            boolean duplicate = false;
            List<Integer> newPair = new ArrayList<>(Arrays.asList(array[start], array[iSecond]));
            Collections.sort(newPair);

            for(List<Integer> pair: pairs) {
                if(newPair.get(0).equals(pair.get(0))) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) pairs.add(newPair);
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
