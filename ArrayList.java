import java.util.Arrays;

public class ArrayList<T> {
    T[] values;
    int size = 0;

    public ArrayList(T[] items){
        values = Arrays.copyOf(items,items.length);
        size = items.length;
    }

    public void add(T item){
        // todo: finish it.
    }
}
