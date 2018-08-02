package algorithm;

import algorithm.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TraverseBinaryTree {

  //前序遍历递归版
  public static List<Integer> preOrderRecursively(TreeNode<Integer> node) {
    List<Integer> list = new ArrayList<>();
    if (node == null)
      return list;
    list.add(node.value);
    list.addAll(preOrderRecursively(node.leftNode));
    list.addAll(preOrderRecursively(node.rightNode));
    return list;
  }

  //中序遍历递归版
  public static List<Integer> inOrderRecursively(TreeNode<Integer> node) {
    List<Integer> list = new ArrayList<>();
    if (node == null)
      return list;
    list.addAll(inOrderRecursively(node.leftNode));
    list.add(node.value);
    list.addAll(inOrderRecursively(node.rightNode));
    return list;
  }

  //后序遍历递归版
  public static List<Integer> postOrderRecursively(TreeNode<Integer> node) {
    List<Integer> list = new ArrayList<>();
    if (node == null)
      return list;
    list.addAll(postOrderRecursively(node.leftNode));
    list.addAll(postOrderRecursively(node.rightNode));
    list.add(node.value);
    return list;
  }

}
