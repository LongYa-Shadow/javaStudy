package top.gaopeng623.processControl;

import java.util.Scanner;

public class WhileTest1 {
  public static void main(String[] args) {
    //世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
    //请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
    //定义一个计数器，初始值为0
    int count = 0;
    //定义珠穆朗玛峰的高度
    int zf = 8848860;//单位：毫米
    double paper = 0.1;//单位：毫米
    while (paper < zf) {
      paper *= 2;
      count++;
    }
    //打印计数器的值
    System.out.println("需要折叠：" + count + "次");
    System.out.println("折纸的高度为" + paper / 1000 + "米，超过了珠峰的高度");

    int positive = 0; //记录正数的个数
    int negative = 0;  //记录负数的个数
    int num = 1; //初始化为特殊值，使得第一次循环条件成立
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一个数");
    while (num != 0) {
      System.out.print("请输入整数（0表示结束）：");
      num = scanner.nextInt();
      if (num > 0) {
        positive++;
      } else if (num < 0) {
        negative++;
      }

    }
    System.out.println("正数个数：" + positive);
    System.out.println("负数个数：" + negative);
    scanner.close();
  }
}
