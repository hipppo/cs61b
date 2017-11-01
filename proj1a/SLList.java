/**
 * Created by Jack on 2017/10/31.
 */
public class SLList {

    private static class IntNode {
        private int item;
        private IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode(99, null);
        sentinel.next = null;
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(99, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public int size() {
        return size;
    }

    public void addLast(int x) {
        IntNode ptr = sentinel;
        while(ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new IntNode(x, null);
        size += 1;
    }
}
