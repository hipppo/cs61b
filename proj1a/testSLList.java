import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Jack on 2017/10/31.
 */

public class testSLList {

    @Test
    public void testgetFirst() {
        SLList test = new SLList(1);
        test.addFirst(2);
        assertEquals(2, test.getFirst());
    }

    @Test
    public void testSize() {
        SLList test = new SLList(1);
        test.addFirst(0);
        test.addLast(2);
        assertEquals(3, test.size());
    }
}
