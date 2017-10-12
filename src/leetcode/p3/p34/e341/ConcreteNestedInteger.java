package leetcode.p3.p34.e341;

import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/6.
 */
public class ConcreteNestedInteger implements NestedInteger {
    int val;
    List<NestedInteger> nestedIntegerList;

    public ConcreteNestedInteger(int val) {
        this.val = val;
    }

    public ConcreteNestedInteger(List<NestedInteger> nestedIntegerList) {
        this.nestedIntegerList = nestedIntegerList;
    }

    @Override
    public boolean isInteger() {
        return null == nestedIntegerList;
    }

    @Override
    public Integer getInteger() {
        return val;
    }

    @Override
    public List<NestedInteger> getList() {
        return nestedIntegerList;
    }
}
