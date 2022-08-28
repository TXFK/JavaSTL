package src;

class NodeStack<T> {
    private final NodeList<T> values;

    public NodeStack() {
        values = new NodeList<>();
    }

    public NodeStack(T[] init) {
        values = new NodeList<>(init);
    }

    public void push(T item) {
        values.add(item);
    }

    public T pop() {
        T result = values.getByIndex(values.size - 1);
        values.delete(values.size - 1);
        return result;
    }

    public boolean isEmpty() {
        return (values.size == 0);
    }

    public T[] toArray() {
        return values.toArray();
    }
}

class NodeQueue<T> {
    private final NodeList<T> values;

    public NodeQueue() {
        values = new NodeList<>();
    }

    public NodeQueue(T[] init) {
        values = new NodeList<>(init);
    }

    public void enqueue(T item) {
        values.add(-1, item);
    }

    public T dequeue() {
        T result = values.getByIndex(values.size - 1);
        values.delete(values.size - 1);
        return result;
    }

    public boolean isEmpty(){
        return (values.size == 0);
    }
}