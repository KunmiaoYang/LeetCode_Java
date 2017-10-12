package algorithms.p1.p18.e187;

import java.util.*;
/**
 *
 * Created by kunmiao.yang on 2017/6/12.
 */
public class Test {
    public static void test() {
        String dna;
        List<String> res;
        long startTime, endTime;

        dna = "";
        System.out.println("DNA = " + dna);
        startTime=System.currentTimeMillis();
        res = new Solution0().findRepeatedDnaSequences(dna);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        dna = "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC";
        System.out.println("DNA = " + dna);
        startTime=System.currentTimeMillis();
        res = new Solution0().findRepeatedDnaSequences(dna);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        dna = "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC";
        System.out.println("DNA = " + dna);
        startTime=System.currentTimeMillis();
        res = new Solution().findRepeatedDnaSequences(dna);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        dna = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println("DNA = " + dna);
        startTime=System.currentTimeMillis();
        res = new Solution().findRepeatedDnaSequences(dna);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
