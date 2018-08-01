package algorithm.base;

public class TreeNode<T> {
    public T value;
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode(T value) {
        this.value = value;
        leftNode = null;
        rightNode = null;
    }
}
