package JavaSTL;

public class NodeList<E> {
    Node<E> head = new Node<>();
    Node<E> tail = head;
    public int size = 0;

    public void add(E item) {
        tail.next = new Node<>();
        tail = tail.next;
        tail.value = item;
        size++;
    }

    public void add(int index, E item) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Method add(int, E)");
        }
        Node<E> pointer = head;
        for (int i = 0; i < index + 1; i++) {
            pointer = pointer.next;
        }
        pointer.next = new Node<>(item, pointer.next);
        size++;
    }

    public void replace(int index, E item) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Method replace(int, E)");
        }
        Node<E> pointer = head;
        for (int i = 0; i <= index; i++) {
            pointer = pointer.next;
        }
        pointer.value = item;
    }

    public void replace(int start, int end, E[] items) {
        if (start > size || end > size) {
            throw new IndexOutOfBoundsException("Method replace(int, int , E[])");
        }
        if (start > end) {
            throw new IllegalArgumentException("parameter start is bigger than para... end");
        }
        if (end - start != items.length) {
            throw new IllegalArgumentException(/*todo: write massage here*/);
        }

        Node<E> pointer = head;
        for (int i = 0; i <= start; i++) {
            pointer = pointer.next;
        }
        for (int i = 0; i < items.length; i++) {
            pointer.value = items[start + i];
            pointer = pointer.next;
        }
    }

    public void delete(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node<E> pointer = head;
        for(int i = 0; i < index; i++){
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;
        size--;
    }

    public Node<E> getHead(){
        return head;
    }

    public E getByIndex(int index){
        Node<E> pointer = head;
        for(int i = 0; i <= index;i++){
            pointer = pointer.next;
        }
        return pointer.value;
    }

    public E[] toArray(){
        Object[] result = new Object[size];
        for(int i = 0;i < size;i++){
            result[i] = getByIndex(i);
        }
        return (E[]) result;
    }

    public NodeList(E[] init) {
        for (E item : init) {
            add(item);
        }
        size = init.length;
    }

    public NodeList(){}
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