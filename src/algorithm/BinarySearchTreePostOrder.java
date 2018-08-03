package algorithm;

import algorithm.base.TreeNode;

public class BinarySearchTreePostOrder {

  /**
   * 二叉搜索树的后序遍历序列
   * <p>
   * 首先要拿到数组末尾即使二叉树根节点，因为是搜索树，所以左子树比根节点小，右子树都比根节点大。
   * 若发现异常即不是后序遍历序列。
   * <p>
   * 1. 因为左子树和右子树都符合以上规律，所以用递归方法；为避免创建新的子树序列数组，需要创建一个新函数，传入start,end
   * 2. 遍历数组，找到值比根节点大的节点，即为左子树和右子树的分界坐标
   * 3. 分界后继续用递归检查是否合法
   *
   * @param postOrder 序列数组
   * @return 序列是否合法
   */
  public static boolean isPostOrder(int[] postOrder) {
    if (postOrder == null || postOrder.length <= 0) return false;
    int len = postOrder.length;
    int start = 0;
    // 这里传入end是(len - 1)，因为数组的len比数组下标大1
    return isPostOrder(postOrder, start, len - 1);
  }

  public static boolean isPostOrder(int[] postOrder, int start, int end) {
    if (start >= end) return true;
    // 取最后一个，即是根节点
    int root = postOrder[end];
    int i = start;
    for (; i < end; i++) {
      // 如果大于节点，则直接break，已记录下的就是左子树和右子树的分界坐标
      if (postOrder[i] >= root) {
        break;
      }
    }

    int j = i;
    for (; j < end; j++) {
      if (postOrder[j] <= root) {
        return false;
      }
    }
    return isPostOrder(postOrder, start, i - 1) && isPostOrder(postOrder, i, end - 1);
  }

  public static void main(String[] args) {
    int[] a = {5, 7, 6, 9, 11, 10, 8};
    int[] b = {7, 4, 6, 5};
    boolean is = isPostOrder(a);
    boolean isB = isPostOrder(b);
    System.out.println("isPostOrder = " + is);
    System.out.println("isPostOrder = " + isB);
  }
}
