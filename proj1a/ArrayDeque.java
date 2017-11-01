/**
 * Created by Jack on 2017/10/31.
 */
public class ArrayDeque<Item> {
    private Item[] items;
    private int size;
    private int prev;
    private int next;


    public ArrayDeque() {
        items = (Item[]) new Object[8];
        size = 0;
        prev = 4;
        next = 5;
    }

    public void addFirst(Item x) {
        items[prev] = x;
        if(prev == 0) {
            prev = items.length - 1;
        } else {
            prev -= 1;
        }
        size += 1;
    }

    public void addLast(Item x) {
        items[next] = x;
        if(next == items.length) {
            next = 0;
        } else {
            next += 1;
        }
        size += 1;
    }

    public Item get(int index) {
        return items[index];
    }


    public boolean isEmpty() {
        for(int i = 0; i < items.length; i++) {
            if(items[i] != null) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        System.out.println()
    }
/*
    public Item removeFirst() {

    }

    public Item removeLast() {

    }
*/
}
