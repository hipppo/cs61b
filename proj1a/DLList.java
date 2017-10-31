/**
 * Created by Jack on 2017/10/31.
 * Single Sentinel Method.
 */

public class DLList {
    private static class IntNode {
        private int item;
        private DLList.IntNode prev;
        private DLList.IntNode next;

        public IntNode(int i, DLList.IntNode p, DLList.IntNode n) {
            item = i;
            prev = p;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    public DLList() {
        sentinel = new IntNode(99, null, null);
        size = 0;
    }

    public DLList(int x) {
        sentinel = new IntNode(99, null, null);
        sentinel.next = new IntNode(x, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }

    public void addFirst(int x) {
        sentinel.next = new DLList.IntNode(x, sentinel, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size += 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public int size() {
        return size;
    }

    public void addLast(int x) {
        sentinel.prev = new DLList.IntNode(x, sentinel.prev, sentinel);
        sentinel.prev.prev.next = sentinel.prev;
        size += 1;
    }
}

/*
 *Sentinel and last method.

public class DLList {
    private static class IntNode {
        private int item;
        private DLList.IntNode prev;
        private DLList.IntNode next;

        public IntNode(int i, DLList.IntNode p, DLList.IntNode n) {
            item = i;
            prev = p;
            next = n;
        }
    }

    private IntNode sentinel;
    private IntNode last;
    private int size;

    public DLList() {
        sentinel = new IntNode(99, null, null);
        last = new IntNode(98, null, null);
        size = 0;
    }

    public DLList(int x) {
        sentinel = new IntNode(99, null, null);
        last = new IntNode(98, null, null);
        sentinel.next = new IntNode(x, sentinel, last);
        last.prev = sentinel.next;
        size = 1;
    }

    public void addFirst(int x) {
        sentinel.next = new DLList.IntNode(x, sentinel, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size += 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public int size() {
        return size;
    }

    public void addLast(int x) {
        last.prev = new DLList.IntNode(x, last.prev, last);
        last.prev.prev.next = last.prev;
        size += 1;
    }
}
*/