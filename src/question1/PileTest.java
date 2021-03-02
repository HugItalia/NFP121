package question1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class PileTest {

    @Test
    public void checkInstanceType() {
        PileAdaptor adaptor = new PileAdaptor(new StackImpl());
        assertTrue(adaptor.stack instanceof StackImpl);
        assertTrue(adaptor instanceof PileI);
    }

    @Test
    public void testEmpiler() {
        PileAdaptor adaptor = new PileAdaptor(new StackImpl());
        adaptor.empiler("One object");
        assertEquals(1, adaptor.stack.getSize());
    }

    @Test
    public void testDepile() {
        PileAdaptor adaptor = new PileAdaptor(new StackImpl());
        adaptor.empiler("One object");
        adaptor.depiler();
        assertEquals(0, adaptor.stack.getSize());
    }

    @Test
    public void testEstVide() {
        PileAdaptor adaptor = new PileAdaptor(new StackImpl());
        assertTrue(adaptor.estVide());
        adaptor.empiler("One object");
        assertFalse(adaptor.estVide());
    }
}
