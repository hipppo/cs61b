/**
 * Created by Jack on 2017/10/31.
 */
public class DLList {
    private static class IntNode {
        private DLList.IntNode prev;
        private int item;
        private DLList.IntNode next;

        public IntNode(DLList.IntNode p, int i, DLList.IntNode n) {
            prev = p;
            item = i;
            next = n;
        }
    }

    private DLList.IntNode sentinel;
    private int size;

    public DLList() {
        sentinel = new IntNode(99, null);
        sentinel.next = null;
        size = 0;
    }

    public DLList(int x) {
        sentinel = new IntNode(99, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

}
