package top.gaopeng623.operator;

/*
 * 条件运算符
 *  1.(条件表达式)?表达式1：表达式2
 *
 *  2.说明：
 *    - 条件表达式的结果是Boolean类型
 *    - 如果条件表达式位true，则执行表达式1，否则，执行表达式2
 *    - 表达式1 和 表达式2 需要是相同的类型或能兼容的类型l
 *    - 凡是可以使用条件运算符的地方，都可以改写为if-else结构。反之，不成立。
      - 开发中，如果既可以使用条件运算符，又可以使用if-else，推荐使用条件运算符。因为执行效率稍高。
 * */
public class ConditionTest {
  public static void main(String[] args) {
    String str = (1 > 2) ? "表达式1" : "表达式2";
    System.out.println("str = " + str);

    double result = (1 < 2) ? 1 : 1.2;
    System.out.println("result = " + result);

    //获取两个数的较大值
    int m1 = 10;
    int m2 = 20;
    System.out.println((m1 > m2) ? m1 : m2);

    //获取三个数中的最大值
    int n1 = 23;
    int n2 = 13;
    int n3 = 33;
    int tempMax = (n1 > n2) ? n1 : n2;
    System.out.println("三个数中的最大值" + ((tempMax > n3) ? tempMax : n3));


  }
}
