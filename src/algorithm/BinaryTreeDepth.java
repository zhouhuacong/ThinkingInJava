package algorithm;

import algorithm.base.TreeNode;
import jdk.nashorn.api.tree.BinaryTree;

public class BinaryTreeDepth {
  /**
   * 如果一棵树只有一个节点，那么它的深度为1。如果有左子树和右子树，
   * 那么它的深度十左子树和右子树之间较大者的深度 再+1。
   *
   * @param node 根节点
   * @return 深度
   */
  public static int getDepth(TreeNode<Integer> node) {
    if (node == null) return 0;

    int left = getDepth(node.leftNode);
    int right = getDepth(node.rightNode);

    return (left > right) ? (left + 1) : (right + 1);
  }
}
