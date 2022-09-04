package JavaSTL;

public class ArrayList<T> {
    T[] values;
    int size = 0;

    public ArrayList(T[] items) {
        Object[] itemsCopy = new Object[items.length];
        System.arraycopy(items, 0, itemsCopy, 0, items.length);
        size = itemsCopy.length;
        values = (T[]) itemsCopy;
    }

    public void add(T item) {

    }
}
