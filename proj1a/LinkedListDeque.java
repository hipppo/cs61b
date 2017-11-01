/**
 * Created by Jack on 2017/10/31.
 */

public class LinkedListDeque<Fushion> {

    private static class FushionNode {
        private Fushion items;
        private LinkedListDeque.FushionNode prev;
        private LinkedListDeque.FushionNode next;

        public FushionNode(Fushion i, LinkedListDeque.FushionNode p, LinkedListDeque.FushionNode n) {
            items = i;
            prev = p;
            next = n;
        }
    }

    private FushionNode sentinel;
    private int size;

    public LinkedListDeque() {
        sentinel = (Fushion[]) new FushionNode(99, null, null);
        size = 0;
    }

    public void addFirst(Fushion x) {

    }

    public void addLast(Fushion x) {

    }

    public boolean isEmpty() {

    }

    public int size() {

    }
/*
    public void printDeque() {

    }

    public Item removeFirst() {

    }

    public Item removeLast() {

    }

    public Item get(int index) {

    }

}
*/
