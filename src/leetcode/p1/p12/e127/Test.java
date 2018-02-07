package leetcode.p1.p12.e127;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 10/17/2017.
 */
public class Test {
    public static void test() {
        List<String> list;
        int res;

        list = Arrays.asList("hot","dog","dot");
        res = new Solution().ladderLength("hot", "dog", list);
        System.out.println("res = " + res);

        list = Arrays.asList("ion","rev","che","ind","lie","wis","oct","ham","jag","ray","nun","ref","wig","jul","ken","mit","eel","paw","per","ola","pat","old","maj","ell","irk","ivy","beg","fan","rap","sun","yak","sat","fit","tom","fin","bug","can", "hes", "col", "pep","tug","ump","arc","fee","lee","ohs","eli","nay","raw","lot","mat","egg","cat","pol","fat","joe","pis","dot","jaw","hat","roe","ada","mac");
        res = new Solution().ladderLength("cat", "fin", list);
        System.out.println("res = " + res);

        list = Arrays.asList("hot","dot","dog","lot","log");
        res = new Solution().ladderLength("hit", "cog", list);
        System.out.println("res = " + res);

        list = Arrays.asList("hot","dot","dog","lot","log","cog");
        res = new Solution().ladderLength("hit", "cog", list);
        System.out.println("res = " + res);
    }
}
