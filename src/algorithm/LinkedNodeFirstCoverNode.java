package algorithm;

public class LinkedNodeFirstCoverNode {
  public static Node getFirstCoverNode(Node node1, Node node2) {
    int len1 = getLength(node1);
    int len2 = getLength(node2);
    int offset = len1 - len2;

    Node shortNode = null;
    Node longNode = null;

    if (offset > 0) {
      longNode = node1;
      shortNode = node2;
    } else {
      longNode = node2;
      shortNode = node1;
    }

    // node1先跳过offset数量的node
    for (int i = 0; i < offset; i++) {
      longNode = longNode.nextNode;
    }
    for (int i = 0; i < len2; i++) {
      if (longNode.key == shortNode.key) {
        return longNode;
      }
      longNode = longNode.nextNode;
      shortNode = shortNode.nextNode;
    }
    return null;
  }

  public static int getLength(Node node) {
    if (node == null) return 0;
    int count = 0;
    while (node.nextNode != null) {
      node = node.nextNode;
      count++;
    }
    return count;
  }

  static class Node {
    public int key;
    public Node nextNode;

    public Node(int key) {
      this.key = key;
    }
  }
}
