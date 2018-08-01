package algorithm;

import algorithm.base.Node;

public class LastNumK {
    /**
     * 链表中倒数第K个结点
     * <p>
     * 1、我们需要知道该链表的长度，判断k值是否合法
     * 2、倒数第k个，我们用两个指针p1,p2，都指向头节点，让一个p2指针先走k步，则p1,p2的距离就是k
     * 3、同时移动p1,p2，直到当p2到末尾时，p1指向的就是倒数第k个节点
     *
     * @param k
     * @return
     */
    public static Node getLastNumK(int k, Node head) {
        // 1. 检查k值合法性
        if (k <= 0) return null;

        int len = 0;
        Node node = head;
        while (node != null) {
            node = node.nextNode;
            ++len;
        }
        if (k == len) {
            return head;
        } else if (k > len) {
            return null;
        }

        // 2. 算法
        Node p1, p2;
        p1 = p2 = head;
        for (int i = 0; i < k; i++) {
            p2 = p2.nextNode;
        }
        while (p2 != null) {
            p2 = p2.nextNode;
            p1 = p1.nextNode;
        }
        return p1;
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
        Node lastNumKNode = getLastNumK(4, node1);
        if (lastNumKNode == null) {
            System.out.println("lastNumKNode is null !");
        } else {
            System.out.println("last num K node : " + lastNumKNode.key);
        }
    }
}
