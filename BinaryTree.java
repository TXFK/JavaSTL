import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree<T> {
    public T value;
    public BinaryTree<T> left;
    public BinaryTree<T> right;

    public BinaryTree() {
    }

    public BinaryTree(T value){
        this.value = value;
    }

    public BinaryTree(T value, BinaryTree<T> left){
        this.value = value;
        this.left = left;
    }
    public BinaryTree(T value, BinaryTree<T> left, BinaryTree<T> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /*——————S————————T————————A————————T————————I———————C————————method————————*/
    public static Object[] levelOrderTraversal(BinaryTree<?> binaryTree){

        Stack<Object> result = new Stack<>();
        LinkedList<BinaryTree<?>> binaryTrees = new LinkedList<>();
        binaryTrees.offer(binaryTree);
        while(!binaryTrees.isEmpty()){
            BinaryTree<?> operatingNode = binaryTrees.poll();
            result.push(operatingNode)
        }
    }

}
