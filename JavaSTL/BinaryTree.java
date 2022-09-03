package JavaSTL;

public class BinaryTree<T> {
    public T value;
    public BinaryTree<T> left;
    public BinaryTree<T> right;

    public BinaryTree() {
    }

    public BinaryTree(T value) {
        this.value = value;
    }

    public BinaryTree(T value, BinaryTree<T> left) {
        this.value = value;
        this.left = left;
    }

    public BinaryTree(T value, BinaryTree<T> left, BinaryTree<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public T[] levelOrderTraversal() {
        NodeStack<T> result = new NodeStack<>();
        NodeQueue<BinaryTree<T>> binaryTrees = new NodeQueue<>();
        binaryTrees.enqueue(this);
        while (!binaryTrees.isEmpty()) {
            BinaryTree<T> operatedNode = binaryTrees.dequeue();
            result.push(operatedNode.value);
            binaryTrees.enqueue(operatedNode.left);
            binaryTrees.enqueue(operatedNode.right);
        }
        return result.toArray();
    }

    public T[] inorderTraversal() {
        NodeStack<T> result = new NodeStack<>();
        if (left != null) {
            for (T items : left.inorderTraversal()) {
                result.push(items);
            }
        }
        result.push(this.value);
        if (right != null) {
            for (T items : right.inorderTraversal()) {
                result.push(items);
            }
        }
        return result.toArray();
    }

    public T[] postOrderTraversal() {
        NodeStack<T> result = new NodeStack<>();
        if (left != null) {
            for (T items : left.inorderTraversal()) {
                result.push(items);
            }
        }
        if (right != null) {
            for (T items : right.inorderTraversal()) {
                result.push(items);
            }
        }
        result.push(this.value);
        return result.toArray();
    }
}
