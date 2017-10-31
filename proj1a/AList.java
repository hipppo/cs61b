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

    public int get(int i) {
        return items[i-1];
    }

    public int size() {
        return size;
    }
}
