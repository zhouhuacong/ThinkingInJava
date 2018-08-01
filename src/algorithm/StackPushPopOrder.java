package algorithm;

import java.util.Stack;

public class StackPushPopOrder {

    /**
     * 栈的压入，弹出序列
     * 1. 需要用到一个辅助栈
     * 2. 压入顺序通过给定的压入pushOrder数组，但是压入的目标数字是有popOrder给出的。
     * 压入{1,2,3,4,5}, 出栈{4,5,3,2,1}
     * <p>
     * 2.1 我们先找到要出栈的数字4，然后根据压栈序列，我们要压入1,2,3,4；然后弹出4
     * 2.2 再找到出栈数字5，所以再压入5，后弹出5
     * 2.3 再找3, 但是由于目前栈顶已经是3了，直接弹出。之后的2,1同理。
     *
     * @param pushOrder 压栈序列
     * @param popOrder  出栈序列
     * @return 出栈序列是否合法
     */
    public static boolean isValidOrder(int pushOrder[], int popOrder[]) {
        if (pushOrder == null || popOrder == null || pushOrder.length != popOrder.length)
            return false;

        int len = popOrder.length;
        Stack<Integer> stack = new Stack<>();
        for (int popNum : popOrder) {
            int pushIndex = 0;
            for (int j = 0; j < len; j++) {
                if (popNum == pushOrder[j]) {
                    pushIndex = j;
                    break;
                }
            }

            for (int n = 0; n < pushIndex; n++) {
                stack.push(pushOrder[n]);
            }
            if (stack.peek() != popNum)
                break;

            stack.pop();
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
        int pop[] = {4, 5, 3, 2, 1};
        boolean is = isValidOrder(push, pop);
        System.out.println("is valid : " + is);
    }
}
