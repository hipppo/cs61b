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
        System.out.print(items[0]);
        for(int i = 1; i < items.length; i++) {
            System.out.print(" " + items[i]);
        }
    }

    public void removeFirst() {
        if(prev == items.length - 1) {
            prev = 0;
        } else {
            prev += 1;
        }
        items[prev] = null;
        size -= 1;
    }

    public void removeLast() {
        if(next == 0) {
            next = items.length;
        } else {
            next -= 1;
        }
        items[next] = null;
        size -= 1;
    }
}
