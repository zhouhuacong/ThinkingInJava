package ThinkInJava.holdObject;

import java.util.*;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue =
        new PriorityQueue<>();
    Random random = new Random(47);
    for (int i = 0; i < 10; i++) {
      priorityQueue.offer(random.nextInt(i + 10));
    }
    printQ(priorityQueue);
    priorityQueue = new PriorityQueue<>(20, Collections.reverseOrder());
    int a = Integer.parseInt("-234");
    System.out.println(a);
    int b = Integer.valueOf("234");


    int x = Character.digit('c', 10);
    System.out.println("x = " + x);
  }

  public static void printQ(Queue queue) {
    while (queue.peek() != null) {
      System.out.print(queue.remove() + " ");
    }
    System.out.println();
  }
}
