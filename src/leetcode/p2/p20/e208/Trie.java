package leetcode.p2.p20.e208;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    boolean isWord = false;
    Map<Byte, Trie> root = new HashMap<>();

    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        insert(word.getBytes(), 0);
    }
    private void insert(byte[] word, int index) {
        if(word.length == index) {
            isWord = true;
            return;
        }
        Trie trie = root.get(word[index]);
        if(null == trie) {
            trie = new Trie();
            root.put(word[index], trie);
        }
        trie.insert(word, index + 1);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return search(word.getBytes(), 0);
    }
    private boolean search(byte[] word, int index) {
        if (word.length == index) return isWord;
        Trie trie = root.get(word[index]);
        return null != root.get(word[index]) && trie.search(word, index + 1);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return startsWith(prefix.getBytes(), 0);
    }
    private boolean startsWith(byte[] prefix, int index) {
        if (prefix.length == index) return true;
        Trie trie = root.get(prefix[index]);
        return null != root.get(prefix[index]) && trie.startsWith(prefix, index + 1);

    }

    public static void main(String[] args) {
        Trie trie = new Trie();
//        trie.insert("");
        trie.insert("a");
        trie.insert("abstract");
        trie.insert("crap");
        trie.insert("crazy");


        System.out.println("end");
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
