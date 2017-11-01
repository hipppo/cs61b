import static org.junit.Assert.*;
import org.junit.Test;

public class testArrayDeque {
    @Test
    public void testAddFirst() {
        ArrayDeque<Object> test = new ArrayDeque<Object>();
        test.addFirst(1);
        test.addFirst(2);
        assertEquals(2, test.get(3));
    }

    @Test
    public void testAddLast() {
        ArrayDeque<Object> test = new ArrayDeque<Object>();
        test.addFirst(1);
        test.addLast(2);
        assertEquals(2, test.get(5));
    }

    @Test
    public void testIsEmpty() {
        ArrayDeque<Object> test = new ArrayDeque<Object>();
        assertTrue(test.isEmpty());
        test.addFirst(1);
        assertFalse(test.isEmpty());
    }

}
