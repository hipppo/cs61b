/**
 * Created by Jack on 2017/10/31.
 * Naive AList.
 */

public class AList {
    private int[] items;
    private int size;

    public AList() {
        items = new int[100];
        size = 0;
    }

    public void addLast(int x) {
        items[size] = x;
        size += 1;
    }

    public int getLast() {
        return items[size-1];
    }

    public int removeLast() {
        int res = items[size - 1];
        size -= 1;
        if(size < items.length * 0.25) {
            resize(items.length / 2);
        }
        return res;
    }

    public int get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public void resize(int capacity) {
        int[] mega = new int[capacity];
        System.arraycopy(items, 0, mega, 0, size);
        items = mega;
    }

    public int insertback(int x) {
        if(size == items.length) {
            resize(size * 2);
        }
        items[size] = x;
        size += 1;
        return items[size - 1];
    }
}
