package leetcode.p2.p27.e273;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * Created by Kunmiao Yang on 11/24/2017.
 */
public class Solution {
    static String[] scale = {" Hundred", "Thousand", "Million", "Billion"};
    static String[] number = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        if(0 == num) return number[0];
        Deque<String> strQue = new ArrayDeque<>(7);
        String words;
        if((words = smallNumberToWords(num % 1000)) != null) strQue.push(words);
        for(int i = 1, n = num / 1000; n > 0; i++, n /= 1000) {
            if((words = smallNumberToWords(n % 1000)) != null) {
                strQue.push(scale[i]);
                strQue.push(words);
            }
        }
        return String.join(" ", strQue);
    }
    private String smallNumberToWords(int num) {
        int lower = num % 100, higher = num / 100;
        String lowWords = null, highWords = null;
        if(lower > 19) {
            lowWords = tens[lower / 10];
            lower %= 10;
            if(lower > 0) lowWords += " " + number[lower];
        } else if(lower > 0) lowWords = number[lower];
        if(higher > 0) highWords = number[higher] + scale[0];
        if(null != lowWords) {
            if(null != highWords) return highWords + " " + lowWords;
            else return lowWords;
        } else if(null != highWords) return highWords;
        return null;
    }
}
