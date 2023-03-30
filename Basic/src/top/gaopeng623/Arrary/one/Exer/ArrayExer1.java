package top.gaopeng623.Arrary.one.Exer;

import java.util.Scanner;

/*

案例：输出英文星期几

  用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
  {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}

  拓展：一年12个月的存储

  用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
  {"January","February","March","April","May","June","July","August","September","October","November","December"}

* */
public class ArrayExer1 {
  public static void main(String[] args) {
    //包含星期的数组
    String[] weeks = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    //从键盘获取指定的数值，使用Scanner
    Scanner scanner = new Scanner(System.in);
    System.out.println("从键盘输入1-7，显示对应的单词");
    int day = scanner.nextInt();
    if (day < 1 || day > 7) {
      System.out.println("输入信息有误");
    } else {
      System.out.println(weeks[day - 1]);
    }
    scanner.close();
  }
}
