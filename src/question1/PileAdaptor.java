package question1;

public class PileAdaptor <E> implements PileI {

    StackImpl stack;

    public PileAdaptor(StackImpl stack)
    {
        this.stack = stack;
    }

    @Override
    public void empiler(Object o) {
        stack.push(o);
    }

    @Override
    public Object depiler() {
        return stack.pop();
    }

    public boolean estVide() {
        return stack.isEmpty();
    }

}