package top.gaopeng623.operator;

//位运算符练习
public class BitExer {
  public static void main(String[] args) {
    //如何交换两个int型变量的值？String呢？
    int n = 10, m = 20;
    System.out.println(String.format("n=%s,m=%s", n, m));
    //推荐）实现方式1：优点：容易理解，适用于不同数据类型    缺点：需要额外定义变量
   /* int temp = n;
    n = m;
    m = n;*/
    //实现方式2：优点：不用定义中转变量，缺点：只适用于数值类型,可以能会超出int类型范围
    //m = m + n;//30 = 20+10
    //n = m - n;//20 = 30-10
    //m = m - n;//10 = 30-20
    //实现方式3:优点：不用定义中转变量，缺点：只适用于数值类型
    m = m ^ n;
    n = m ^ n;//(m ^ n)^ n
    m = m ^ n;
    System.out.println(String.format("n=%s,m=%s", n, m));
  }
}
