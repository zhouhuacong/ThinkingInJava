package algorithm;

import java.util.LinkedList;
import java.util.Stack;

public class TwoStackImplQueue<T> {

  private Stack<T> stack1;
  private Stack<T> stack2;

  public void push(T value) {
    stack1.push(value);
  }

  public T pop() {
    if (stack2.isEmpty()) {
      for (T val = stack1.pop(); stack1.isEmpty(); ) {
        stack1.push(val);
      }
    }
    return stack1.pop();
  }

  public int size() {
    int len1 = stack1.size();
    int len2 = stack2.size();
    return len1 + len2;
  }
}

class TwoQueueImplStack<T> {
  private LinkedList<T> queue1 = new LinkedList<>();
  private LinkedList<T> queue2 = new LinkedList<>();

  public void push(T val) {
    if (queue1.isEmpty()) {
      queue1.add(val);
    } else {
      queue2.add(val);
    }
  }

  public T pop() {
    if (!queue1.isEmpty()) {
      while (queue1.size() > 0) {
        queue2.addLast(queue1.removeFirst());
      }
      return queue1.removeFirst();
    } else {
      while (queue2.size() > 0) {
        queue1.addLast(queue2.removeFirst());
      }
      return queue2.removeFirst();
    }
  }

  public int size() {
    return queue1.size() + queue2.size();
  }

}

