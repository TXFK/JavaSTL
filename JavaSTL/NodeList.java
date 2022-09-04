package JavaSTL;

public class NodeList<T> implements List<T> {
    Node<T> head = new Node<>();
    Node<T> tail = head;
    private int size = 0;

    @Override
    public void add(T element) {
        tail.next = new Node<>();
        tail = tail.next;
        tail.value = element;
        size++;
    }

    @Override
    public void add(T element, int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Method add(int, T)");
        }
        Node<T> pointer = head;
        for (int i = 0; i < index + 1; i++) {
            pointer = pointer.next;
        }
        pointer.next = new Node<>(element, pointer.next);
        size++;
    }

    @Override
    public void add(List<? extends T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public void remove() {
        removeByIndex(size - 1);
    }

    @Override
    public void remove(T element) {
        removeByIndex(indexOf(element));
    }

    @Override
    public void remove(List<? extends T> list) {
        for (int i = 0; i < list.size(); i++) {
            remove(list.get(i));
        }
    }

    @Override
    public void removeByIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> pointer = head;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;
        size--;
    }

    @Override
    public void set(int index, T element) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Method replace(int, T)");
        }
        Node<T> pointer = head;
        for (int i = 0; i <= index; i++) {
            pointer = pointer.next;
        }
        pointer.value = element;
    }

    @Override
    public void set(int start, int end, T[] elements) {
        if (start > size || end > size) {
            throw new IndexOutOfBoundsException("Method replace(int, int , T[])");
        }
        if (start > end) {
            throw new IllegalArgumentException("parameter start is bigger than para... end");
        }
        if (end - start != elements.length) {
            throw new IllegalArgumentException(/*todo: write massage here*/);
        }

        Node<T> pointer = head;
        for (int i = 0; i <= start; i++) {
            pointer = pointer.next;
        }
        for (int i = 0; i < elements.length; i++) {
            pointer.value = elements[start + i];
            pointer = pointer.next;
        }
    }

    @Override
    public T get(int index) {
        Node<T> pointer = head;
        for (int i = 0; i <= index; i++) {
            pointer = pointer.next;
        }
        return pointer.value;
    }

    @Override
    public int indexOf(T element) {
        Node<T> pointer = head;
        for (int i = 0; i < size; i++) {
            pointer = pointer.next;
            if (!pointer.value.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T element) {
        int lastIndex = -1;
        Node<T> pointer = head;
        for (int i = 0; i < size; i++) {
            pointer = pointer.next;
            if (!pointer.value.equals(element)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public int size() {
        return size;
    }


    public Node<T> getHead() {
        return head;
    }


    public T[] toArray() {
        Object[] result = new Object[size];
        Node<T> pointer = head;
        for (int i = 0; i < size; i++) {
            pointer = pointer.next;
            result[i] = pointer.value;
        }
        return (T[]) result;
    }

    public NodeList(T[] init) {
        for (T item : init) {
            add(item);
        }
        size = init.length;
    }

    public NodeList() {
    }
}

class Node<E> {
    public E value;
    public Node<E> next;

    Node() {
        value = null;
        next = null;
    }

    Node(E value) {
        this.value = value;
        next = null;
    }

    Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }
}