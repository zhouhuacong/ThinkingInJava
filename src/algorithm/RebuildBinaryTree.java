package algorithm;

import algorithm.base.TreeNode;

import java.util.List;

public class RebuildBinaryTree {

  public static void main(String[] args) {
    //            1
    //          /   \
    //         2     3
    //        / \
    //       4   5
    //pre->12453  in->42513   post->45231
    int[] pre = {1, 2, 4, 5, 3};
    int[] in = {4, 2, 5, 1, 3};
    TreeNode root = rebuild(pre, in);
    //对重建后的树,进行前中后序遍历，验证是否重建正确
    //调用的重建函数见：http://www.jianshu.com/p/362d4ff42ab2
    List<Integer> preorder = TraverseBinaryTree.preOrderRecursively(root);
    List<Integer> inorder = TraverseBinaryTree.inOrderRecursively(root);
    List<Integer> postorder = TraverseBinaryTree.postOrderRecursively(root);
    System.out.println(preorder);
    System.out.println(inorder);
    System.out.println(postorder);
  }

  /**
   * 输入两个数组，分别表示的是前序遍历和中序遍历的结果
   *
   * @param preOrder 前序遍历 {1,2,4,7,3,5,6,8}
   * @param inOrder  中序遍历 {4,7,2,1,5,3,8,6}
   * @return 结果二叉树的根节点
   */
  public static TreeNode rebuild(int[] preOrder, int[] inOrder) {
    if (preOrder == null || inOrder == null ||
        preOrder.length != inOrder.length || inOrder.length <= 0) {
      return null;
    }


    int len = preOrder.length;
    TreeNode node = rebuildRecursive(preOrder, 0, inOrder, 0, len);
    return node;
  }

  public static TreeNode rebuildRecursive(int[] preOrder, int preStart,
                                          int[] inOrder, int inStart,
                                          int length) {
    if (length <= 0) return null;
    TreeNode<Integer> head = new TreeNode<>(preOrder[preStart]);
    int inOrderRootIndex = -1;
    for (int i = inStart; i < inStart + length; i++) {
      if (head.value == inOrder[i]) {
        // 找到了根节点的值（该根节点的意思也可以是子树的根节点）
        inOrderRootIndex = i;
        break;
      }
    }
    // 分为两堆数：左子树、右子树
    int leftLength = inOrderRootIndex - inStart;
    head.leftNode = rebuildRecursive(preOrder, preStart + 1, inOrder, inStart, leftLength);
    head.rightNode = rebuildRecursive(preOrder, preStart + leftLength + 1, inOrder, inOrderRootIndex + 1, length - leftLength - 1);

    return head;
  }
}
