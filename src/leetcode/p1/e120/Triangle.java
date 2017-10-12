package algorithms.p1.e120;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/5/5.
 */
public class Triangle {
    public static void main(String[] args) {
        int sCount = 1000;
        int range = 1000;
        Random random = new Random();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<Integer>(Arrays.asList(1)));
        triangle.add(new ArrayList<Integer>(Arrays.asList(1, 100)));
        triangle.add(new ArrayList<Integer>(Arrays.asList(1, 1000, 100)));
        triangle.add(new ArrayList<Integer>(Arrays.asList(1, 100, -200, 100)));

        long startTime=System.currentTimeMillis();
        int mt = new Triangle().minimumTotal(triangle);
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("Min: " + mt);
        System.out.println("Time span: "+(endTime-startTime)+"ms");
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int levelCount = triangle.size();
        if(levelCount<1) return 0;
        if(levelCount<2) return triangle.get(0).get(0);

        int[] levelSum = new int[levelCount],
                levelSumSmall = new int[levelCount - 2];
        levelSum[0] = triangle.get(0).get(0) + triangle.get(1).get(0);
        levelSum[1] = triangle.get(0).get(0) + triangle.get(1).get(1);

        // When level count > 2
        for(int level = 2; level < levelCount; level++) {
            List<Integer> levelVal = triangle.get(level);
            for(int i = 0; i < level - 1; i++) levelSumSmall[i] = Math.min(levelSum[i], levelSum[i + 1]);
            levelSum[0] += levelVal.get(0);
            levelSum[level] = levelSum[level - 1] + levelVal.get(level);
            for(int i = 1; i < level; i++) levelSum[i] = levelSumSmall[i - 1] + levelVal.get(i);
        }

        int min = levelSum[0];
        for(int i = 1; i < levelCount; i++) min = Math.min(levelSum[i], min);
        return min;
    }
}
