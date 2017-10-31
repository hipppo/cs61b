import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Jack on 2017/10/31.
         */
public class testDLList {
    @Test
    public void testgetFirst() {
        DLList test = new DLList(1);
        test.addFirst(2);
        assertEquals(2, test.getFirst());
    }

    @Test
    public void testSize() {
        DLList test = new DLList(1);
        test.addFirst(0);
        test.addLast(2);
        assertEquals(3, test.size());
    }
}
