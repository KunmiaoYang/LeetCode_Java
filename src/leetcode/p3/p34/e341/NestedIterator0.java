package leetcode.p3.p34.e341;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/6.
 */
public class NestedIterator0 implements Iterator<Integer> {
    List<Integer> intList;
    Iterator<Integer> iterator;

    public NestedIterator0(List<NestedInteger> nestedList) {
        this.intList = new LinkedList<>();
        traverse(nestedList);
        this.iterator = intList.iterator();
    }

    private void traverse(List<NestedInteger> nestedList) {
        for(NestedInteger nestedInteger: nestedList) {
            if(nestedInteger.isInteger()) intList.add(nestedInteger.getInteger());
            else traverse(nestedInteger.getList());
        }
    }

    @Override
    public Integer next() {
        return this.iterator.next();
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */