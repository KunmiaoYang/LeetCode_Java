package leetcode.p2.p20.e208;

/**
 *
 * Created by kunmiao.yang on 2017/5/9.
 */
public class Trie1 {
    boolean isWord = false;
    Trie1[] subTries = new Trie1[26];

    /** Initialize your data structure here. */
    public Trie1() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie1 node = this;
        for(byte b: word.getBytes()) {
            if(null == node.subTries[getIndex(b)]) node.subTries[getIndex(b)] = new Trie1();
            node = node.subTries[getIndex(b)];
        }
        node.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie1 node = this;
        for(byte b: word.getBytes()) {
            node = node.subTries[getIndex(b)];
            if(null == node) return false;
        }
        return node.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie1 node = this;
        for(byte b: prefix.getBytes()) {
            node = node.subTries[getIndex(b)];
            if(null == node) return false;
        }
        return true;
    }

    public static int getIndex(byte b) {
        return (b&159)-1;
    }


    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        Trie1 trie = new Trie1();
        trie.insert("a");
        trie.insert("abs");
        trie.insert("c");
        trie.insert("crop");
        trie.insert("crazy");
        trie.startsWith("cra");
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("Time span: "+(endTime-startTime)+"ms");
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */