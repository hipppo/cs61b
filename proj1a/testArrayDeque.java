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

    @Test
    public void testRemoveFirst() {
        ArrayDeque<Object> test = new ArrayDeque<Object>();
        test.addFirst(1);
        test.addLast(2);
        test.removeFirst();
        assertEquals(null, test.get(4));
    }

    @Test
    public void testRemoveLast() {
        ArrayDeque<Object> test = new ArrayDeque<Object>();
        test.addFirst(1);
        test.addLast(2);
        test.removeLast();
        assertEquals(null, test.get(5));
    }

    @Test
    public void testSize() {
        ArrayDeque<Object> test = new ArrayDeque<Object>();
        test.addFirst(1);
        test.addLast(2);
        assertEquals(2, test.size());

    }

    public static void main(String[] args) {
        ArrayDeque<Object> test = new ArrayDeque<Object>();
        test.addFirst(1);
        test.addFirst(2);
        test.addFirst("string test");
        test.addFirst("string test2");
        test.addFirst("string test3");
        test.addFirst("string test4");
        test.addFirst("string test5");
        test.addFirst(3);
        test.addLast("overlap");
        test.printDeque();
    }
}
