package algorithm;

public class JumpFloor2 {

  /**
   * 变态跳问题
   * <p>
   * fib(n) = fib(0)+fib(1)+fib(2)+...+fib(n-2)_fib(n-1);
   *
   * @param floor 层数
   * @return 跳的方法总数
   */
  public static long jumpFloor(long floor) {
    if (floor == 0 || floor == 1) {
      return 1;
    } else if (floor == 2) {
      return 2;
    } else if (floor == 3) {
      return 4;
    }
    long res = 0, i = 1;
    while (i <= floor) {
      res += jumpFloor(floor - i);
      i++;
    }
    return res;
  }

  /**
   * 2的n-1次方
   *
   * @param floor
   * @return
   */
  public static long jumpFloor2(long floor) {
    return 1 << --floor;
  }

  /**
   * 2的n-1次方
   *
   * @param floor
   * @return
   */
  public static long jumpFloor3(long floor) {
    long res = 1;
    while ((--floor) > 0) {
      res *= 2;
    }
    return res;
  }


  public static void main(String[] args) {
    /**
     * 因为int取值范围问题，超过32就显示不出了
     */
    System.out.println(jumpFloor2(30));
  }
}
