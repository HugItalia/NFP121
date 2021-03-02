package question1;

import java.util.Stack;

public class StackImpl implements StackI {
    private Stack stk;

    StackImpl() {
        this.stk = new Stack();
    }

    public int getSize() {
        return this.stk.size();
    }

    @Override
    public void push(Object o) {
        this.stk.push(o);
    }

    @Override
    public Object pop() {
        this.stk.pop();
        return this.stk;
    }

    @Override
    public boolean isEmpty() {
        return this.stk.isEmpty();
    }
}
