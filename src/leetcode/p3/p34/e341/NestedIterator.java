package leetcode.p3.p34.e341;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/6.
 */
public class NestedIterator implements Iterator<Integer> {
    Deque<Iterator<NestedInteger>> dequeIterator = new LinkedList<>();
    NestedInteger next;

    public NestedIterator(List<NestedInteger> nestedList) {
        dequeIterator.add(nestedList.iterator());
    }

    @Override
    public Integer next() {
        return next.getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!dequeIterator.isEmpty()) {
            Iterator<NestedInteger> iterator = dequeIterator.peek();
            if(iterator.hasNext()) {
                if((next = iterator.next()).isInteger()) return true;
                dequeIterator.push(next.getList().iterator());
            } else dequeIterator.pop();
        }
        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */