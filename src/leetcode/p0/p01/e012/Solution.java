package leetcode.p0.p01.e012;

/**
 * Created by kunmiao.yang on 2017/5/18.
 */
public class Solution {
    char[] digitOne = {'I', 'X', 'C', 'M'};
    char[] digitFive = {'V', 'L', 'D'};
    StringBuilder sb = new StringBuilder();
    public String intToRoman(int num) {
        if(num<1 || num>3999) return null;
        for(int i =0; num>0; i++) {
            int digit = num%10;
            num /= 10;
            switch (digit) {
                case 0:
                case 1:
                case 2:
                case 3:
                    for(int j = 0; j<digit; j++) sb.insert(0, digitOne[i]);
                    break;
                case 4:
                    sb.insert(0, digitFive[i]).insert(0, digitOne[i]);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    for(int j = 5; j<digit; j++) sb.insert(0, digitOne[i]);
                    sb.insert(0, digitFive[i]);
                    break;
                case 9:
                    sb.insert(0, digitOne[i+1]).insert(0, digitOne[i]);
                    break;
            }
        }
        return sb.toString();
    }
}
