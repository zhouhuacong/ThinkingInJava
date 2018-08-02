package algorithm;

import algorithm.base.TreeNode;

import java.util.Stack;

public class FindTreeSumPath {

  /**
   * 二叉树中和为某一值得路径
   *
   * 1. 我们要把经过的路径上的结点都保存起来，也就是需要一个辅助栈stack;
   * 2. 通过前序遍历找到末尾节点，当发现是叶子节点时判断是否总和是否是给定值sum；如果是即找到一条路径
   * 3. 当遍历到根节点，发现不是符合要求的路径时，要从stack中pop()出当前节点。
   */
  public static void findPath(TreeNode<Integer> node, int sum) {
    if (node == null) return;
    Stack<Integer> stack = new Stack<>();
    findPathImpl(node, sum, stack);
  }

  public static void findPathImpl(TreeNode<Integer> node, int sum, Stack<Integer> path) {
    if (node == null) return;
    if (node.leftNode == null && node.rightNode == null) {
      if (node.value == sum) {
        System.out.println("找到一个路径：");
        for (int val : path) {
          System.out.print(val + " + ");
        }
        System.out.println(node.value + " .");
      }
    } else {
      path.add(node.value);
      int curVal = node.value;
      findPathImpl(node.leftNode, sum - curVal, path);
      findPathImpl(node.rightNode, sum - curVal, path);
      path.pop();
    }
  }

  public static void main(String[] args) {
    TreeNode<Integer> node1 = new TreeNode<>(10);
    TreeNode<Integer> node2 = new TreeNode<>(5);
    TreeNode<Integer> node3 = new TreeNode<>(12);
    TreeNode<Integer> node4 = new TreeNode<>(4);
    TreeNode<Integer> node5 = new TreeNode<>(7);
    node1.leftNode = node2;
    node1.rightNode = node3;
    node2.leftNode = node4;
    node2.rightNode = node5;

    findPath(node1, 22);
  }
}
