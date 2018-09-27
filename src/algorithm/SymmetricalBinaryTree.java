package algorithm;

import algorithm.base.TreeNode;

public class SymmetricalBinaryTree {

  /**
   * 对称的二叉树
   * <p>
   * 判断二叉树是否对称的，需要定义一个新前序遍历方案，从右节点开始遍历；看是否和左前序遍历相同
   * 要考虑为null的子节点，因为有可能二叉树全部的值都是相同的，但也不是对称二叉树。
   */
  public static boolean isSymmetrical(TreeNode node) {
    return isSymmetrical(node, node);
  }

  public static boolean isSymmetrical(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) return true;
    if (node1 == null || node2 == null) return false;
    if (node1.value != node2.value) return false;

    return isSymmetrical(node1.leftNode, node2.rightNode) &&
        isSymmetrical(node1.rightNode, node2.leftNode);
  }
}
