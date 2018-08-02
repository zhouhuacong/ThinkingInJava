package algorithm;

import algorithm.base.Node;

public class ReverseLinkedList {
  /**
   * 反转链表
   * <p>
   * 首先我们要知道，前一个节点(preNode)，当前节点(node)，后一个节点(nextNode)
   * <p>
   * 例如有链表：a, b, c, d, e, f, g
   * 从第一个a开始，preNode = null, node = a, nextNode = b.
   *
   * @param head 头结点
   * @return 反转后的头结点
   */
  public static Node reverseList(Node head) {
    Node reversedHead = null;
    // 传入的node，在第一次就是a
    // 前一个node，在第一次时就是null，因为a是头节点
    Node preNode = null;
    // nextNode第一次就是b
    Node node = head;
    while (node != null) {
      Node nextNode = node.nextNode;
      if (nextNode == null) {
        // 如果nextNode为空，说明是链表尾部了，记录下来直接返回即可
        reversedHead = node;
      }
      // 修改，让a的下一个指向preNode（一次循环只改一个节点的指向）
      node.nextNode = preNode;
      preNode = node;
      node = nextNode;
    }
    return reversedHead;
  }

  public static void main(String[] args) {
    Node node1 = new Node(11);
    Node node2 = new Node(12);
    Node node3 = new Node(13);
    Node node4 = new Node(14);
    Node node5 = new Node(15);
    Node node6 = new Node(16);
    Node node7 = new Node(17);
    Node node8 = new Node(18);
    node1.nextNode = node2;
    node2.nextNode = node3;
    node3.nextNode = node4;
    node4.nextNode = node5;
    node5.nextNode = node6;
    node6.nextNode = node7;
    node7.nextNode = node8;
    Node node = node1;
    while (node != null) {
      System.out.println(node.key);
      node = node.nextNode;
    }
    System.out.println("=====================");
    Node reNode = reverseList(node1);
    while (reNode != null) {
      System.out.println(reNode.key);
      reNode = reNode.nextNode;
    }
  }
}
