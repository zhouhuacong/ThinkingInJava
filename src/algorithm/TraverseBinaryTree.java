package algorithm;

import algorithm.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TraverseBinaryTree {

    //前序遍历递归版
    public static List<Integer> preorderRecursively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        if (node == null)
            return list;
        list.add(node.value);
        list.addAll(preorderRecursively(node.leftNode));
        list.addAll(preorderRecursively(node.rightNode));
        return list;
    }

    //中序遍历递归版
    public static List<Integer> inorderRecursively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        if (node == null)
            return list;
        list.addAll(inorderRecursively(node.leftNode));
        list.add(node.value);
        list.addAll(inorderRecursively(node.rightNode));
        return list;
    }

    //后序遍历递归版
    public static List<Integer> postorderRecursively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        if (node == null)
            return list;
        list.addAll(postorderRecursively(node.leftNode));
        list.addAll(postorderRecursively(node.rightNode));
        list.add(node.value);
        return list;
    }

}
