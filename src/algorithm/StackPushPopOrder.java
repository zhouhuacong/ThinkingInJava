package algorithm;

import java.util.Stack;

public class StackPushPopOrder {

  /**
   * 栈的压入，弹出序列
   * <p>
   * 因为有入栈序列，所以从入栈开始，遍历入栈序列
   * 1. 遍历入栈序列时，每遍历一个，就判断是否是出栈序列中的需要弹出的值，
   * 2. 如果是则弹出，然后出栈序列加一，接着继续根据入栈序列添加（for循环继续）
   * 3. 如果不是，则继续根据入栈序列添加，直到匹配出栈序列需要的数字为止
   * 4. 如果遍历完都发现没有匹配的，则该出栈序列不是合法出栈序列
   */
  public static boolean isPopValid(int[] pushOrder, int[] popOrder) {
    if (pushOrder.length == 0 || popOrder.length == 0 || pushOrder.length != popOrder.length)
      return false;
    Stack<Integer> stack = new Stack<>();
    int j = 0;
    for (int current : pushOrder) {
      stack.push(current);
      while ((!stack.empty()) && (stack.peek() == popOrder[j])) {
        stack.pop();
        j++;
      }
    }
    return stack.empty();
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    int push[] = {1, 2, 3, 4, 5};
//    int pop[] = {4, 5, 3, 2, 1};
    int pop[] = {3, 4, 2, 1, 5};
    boolean is3 = isPopValid(push, pop);
    System.out.println("is valid : " + is3);
  }
}
