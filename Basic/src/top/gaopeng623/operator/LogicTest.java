package top.gaopeng623.operator;

/* 逻辑运算符
 *   1. & && | ||  ! ^
 *   逻辑运算符说明：
 *     - 操作的都是boolean类型的变量或常量
 *     - 运算得结果也是boolean类型的值。
 *     - 通常使用在条件判断、循环结构种
 * */
public class LogicTest {
  public static void main(String[] args) {
    /*
     *   区分：&(逻辑与、单与、单且)  &(短路与、双与))
     *
     *   1、相同点：两个符号表达都是“且”的关系，当符号左右两边布尔值都是true时，结果才能为true
     *   2、执行过程：
     *      1.如果符号左边是true，则&、&&都会执行右边的操作
     *      2.如果符号左边是false，则&会继续执行右边的操作
     *                           &&不会执行右边的操作
     *   3、开发中，推荐使用&&
     * */

    boolean b1 = true;
    b1 = false;
    int num = 10;
    if (b1 & (num++ > 0)) {
      System.out.println("&true");
    } else {
      System.out.println("&false");
    }
    System.out.println("num = " + num);

    boolean b2 = true;
    b2 = false;
    int num2 = 10;
    if (b2 & (num2++ > 0)) {
      System.out.println("&&true");
    } else {
      System.out.println("&&false");
    }
    System.out.println("num2 = " + num2);
    //***********************************
    /*
     *   区分：|(逻辑或、单或)  ||(短路或、双或))
     *
     *   1、相同点：两个符号表达都是“或”的关系，只要符号左右两边存在true时，结果就能为true
     *   2、执行过程：
     *      1.如果符号左边是false，则|、||都会执行右边的操作
     *      2.如果符号左边是false，则|会继续执行右边的操作
     *                           ||不会执行右边的操作
     *   3、开发中，推荐使用||
     * */

    boolean b3 = true;

    int num3 = 10;
    if (b3 | (num3++ > 0)) {
      System.out.println("|true");
    } else {
      System.out.println("|false");
    }
    System.out.println("num3 = " + num3);

    boolean b4 = true;
    int num4 = 10;
    if (b4 || (num4++ > 0)) {
      System.out.println("||true");
    } else {
      System.out.println("||false");
    }
    System.out.println("num4 = " + num4);
  }

}
