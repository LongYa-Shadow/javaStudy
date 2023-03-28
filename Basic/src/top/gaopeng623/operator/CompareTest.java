package top.gaopeng623.operator;

/*
 *   比较运算符
 *      1. == != > < >= <= instanceof(在面向对象的多态性的位置讲解)
 *
*    说明：
*       比较运算符的结果都是boolean型，也就是要么是true，要么是false。
        > < >= <= ：只适用于基本数据类型（除boolean类型之外）
        == != ：适用于基本数据类型和引用数据类型
        比较运算符“==”不能误写成“=”
 * */
public class CompareTest {
  public static void main(String[] args) {
    int i1 = 1;
    int i2 = 2;
    boolean compare1 = i1 > i2;
    System.out.println("compare1 = " + compare1);//false

    int m = 10;
    int n = 20;
    System.out.println(m == n);//false
    System.out.println(m = n);//20

    boolean b1 = false;
    boolean b2 = true;
    System.out.println(b1 == b2);//false
    System.out.println(b1 = b2);//true

  }

}
