package algorithm;

import algorithm.base.TreeNode;

import java.util.LinkedList;

public class BinaryTreeTraversal {

  /***
   * 从上到下遍历二叉树
   *
   * 需要一个辅助队列存放当前节点和其左右子节点
   * 每遍历一个节点，都把它左右子节点放入队列中
   */
  public static void up2Down(TreeNode node) {
    if (node == null) return;
    LinkedList<TreeNode> list = new LinkedList<>();
    TreeNode head = node;
    list.add(head);
    while (!list.isEmpty()) {
      TreeNode aNode = list.pop();
      TreeNode left = aNode.leftNode;
      TreeNode right = aNode.rightNode;
      if (left != null) {
        list.add(left);
      }
      if (right != null) {
        list.add(right);
      }
      System.out.println(aNode.value);
    }
  }

  public static void main(String[] args) {
    TreeNode<Integer> node1 = new TreeNode<>(8);
    TreeNode<Integer> node2 = new TreeNode<>(6);
    TreeNode<Integer> node3 = new TreeNode<>(10);
    TreeNode<Integer> node4 = new TreeNode<>(5);
    TreeNode<Integer> node5 = new TreeNode<>(7);
    TreeNode<Integer> node6 = new TreeNode<>(9);
    TreeNode<Integer> node7 = new TreeNode<>(11);

    node1.leftNode = node2;
    node1.rightNode = node3;
    node2.leftNode = node4;
    node2.rightNode = node5;
    node3.leftNode = node6;
    node3.rightNode = node7;

    TreeNode<Integer> n = new TreeNode<>(99);
    n.leftNode = null;
    n.rightNode = null;

    up2Down(n);
    up2Down(node1);
  }

}
