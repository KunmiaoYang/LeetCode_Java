package leetcode.p2.p20.e208;

import java.util.Random;

/**
 *
 * Created by kunmiao.yang on 2017/5/9.
 */
public class Trie0 {
    boolean isWord;
    Trie0[] subTries = new Trie0[26];

    /** Initialize your data structure here. */
    public Trie0() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        insert(word.getBytes(), 0);
    }
    private void insert(byte[] word, int iWord) {
        if(word.length == iWord) isWord = true;
        else {
            int iTrie = getIndex(word[iWord]);
            if(null == subTries[iTrie]) subTries[iTrie] = new Trie0();
            subTries[iTrie].insert(word, iWord+1);
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return search(word.getBytes(), 0);
    }
    private boolean search(byte[] word, int iWord) {
        if (word.length == iWord) return isWord;
        int iTrie = getIndex(word[iWord]);
        return null != subTries[iTrie] && subTries[iTrie].search(word, iWord + 1);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return startsWith(prefix.getBytes(), 0);
    }
    private boolean startsWith(byte[] prefix, int iPre) {
        if (prefix.length == iPre) return true;
        int iTrie = getIndex(prefix[iPre]);
        return null != subTries[iTrie] && subTries[iTrie].startsWith(prefix, iPre + 1);
    }

    public static int getIndex(byte b) {
        return (b&159)-1;
    }


    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        Trie trie = new Trie();
        trie.insert("a");
        trie.search("a");
        trie.startsWith("a");
        long endTime=System.currentTimeMillis(); //��ȡ����ʱ��
        System.out.println("Time span: "+(endTime-startTime)+"ms");
        Random rand = new Random();
        double sum = 0;
        for(int i = 0; i<10000; i++) sum+=rand.nextDouble();
        System.out.println("sum: "+sum);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */