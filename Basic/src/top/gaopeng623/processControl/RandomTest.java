package top.gaopeng623.processControl;

import java.util.Random;

/* 获取一个随机数
    如何获取[a,b]范围内的随机整数呢？(int)(Math.random() * (b - a + 1)) + a
 *
 *
 * */
public class RandomTest {

  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      System.out.println(random.nextInt(6 - 1 + 1) + 1);

    }

  }
}
