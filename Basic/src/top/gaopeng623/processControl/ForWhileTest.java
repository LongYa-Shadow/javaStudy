package top.gaopeng623.processControl;

import java.util.Scanner;

/*
 *  “无限”循环结构的使用
 *       最简单"无限"循环格式：while(true) , for(;;)
 *
 *    - 开发中，有时并不确定需要循环多少次，需要根据循环体内部某些条件，来控制循环的结束（使用break）。
      - 如果此循环结构不能终止，则构成了死循环！开发中要避免出现死循环。
 * */
public class ForWhileTest {
  public static void main(String[] args) {
   /* while (true) {
      System.out.println("true");
    }
    for (; ; ) {
      System.out.println("for");
    }*/
    //死循环后面不能有执行语句
    //System.out.println("false");

    //从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
    Scanner scanner = new Scanner(System.in);
    int positiveNumber = 0;//统计正数的个数
    int negativeNumber = 0;//统计负数的个数
    while (true) {
      System.out.println("请输入一个整数,输入位0时结束");
      int num = scanner.nextInt();
      if (num > 0) {
        positiveNumber++;
      } else if (num < 0) {
        negativeNumber++;
      } else {
        break;
      }
    }
    System.out.println("正数的个数为：" + positiveNumber);
    System.out.println("负数的个数为：" + negativeNumber);
    scanner.close();
  }
}
