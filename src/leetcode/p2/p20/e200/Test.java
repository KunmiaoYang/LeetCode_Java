package leetcode.p2.p20.e200;

/**
 *
 * Created by kunmiao.yang on 2017/6/5.
 */
public class Test {
    public static void test() {
        char[][] input;
        int res;
        long startTime, endTime;

        input = Util.createMatrix(new String[]{"10110010111101011110","01001010111111011011","10010101011011100110","01100110111100100011","11010010001010111011","00001011001001011110","10111101101101110010","01100010010111001101","00001101001101001010","00111010101110111110","10101110111010101011","00111101110100011101","11100000110111011110","00111001001111110110","00011000011010011111","01110100111110111001","00001111000010000110","11111111110110111111","01001001111110101111","00111110001111110110"});
        Util.printMatrix(input);
        startTime=System.currentTimeMillis();
        res = new Solution().numIslands(input);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = Util.createMatrix(new String[]{"1111111","0000001","1111101","1000101","1010101","1011101","1111111"});
        Util.printMatrix(input);
        startTime=System.currentTimeMillis();
        res = new Solution().numIslands(input);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = Util.createMatrix(new String[]{"10011101100000000000","10011001000101010010","00011110101100001010","00011001000111001001","00000001110000000000","10000101011000000101","00010001010101010101","00010100110101101110","00001001100001000101","00100100000100100010","10010000000100101010","01000101011011101100", "11010000100000010001","01001110001111101000","00111000110001010000","10010100001000101011","10100000010001010000","01100011101010111100","01000011001010010011","00000011110100011000"});
        Util.printMatrix(input);
        startTime=System.currentTimeMillis();
        res = new Solution().numIslands(input);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = Util.createMatrix(new String[]{"11110", "11010", "11000", "00000"});
        Util.printMatrix(input);
        startTime=System.currentTimeMillis();
        res = new Solution().numIslands(input);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = Util.createMatrix(new String[]{"11000", "11000", "00100", "00011"});
        Util.printMatrix(input);
        startTime=System.currentTimeMillis();
        res = new Solution().numIslands(input);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
