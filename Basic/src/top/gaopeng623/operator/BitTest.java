package top.gaopeng623.operator;

/*
 * 位运算符
 *    >> << >>> & | ^ ~
 *
 *    说明：
 *      位运算符的运算过程都是基于二进制的补码运算
 *      运算规则：在一定范围内，数据每向左移动一位，相当于原数据*2。（正数、负数都适用）
        【注意】当左移的位数n超过该数据类型的总位数时，相当于左移（n-总位数）位
 *
 * */
public class BitTest {
  public static void main(String[] args) {

    int num = 7;
    System.out.println("num>>1 = " + (num >> 1));
    System.out.println("num>>2 = " + (num >> 2));
    System.out.println("num>>3 = " + (num >> 3));
    System.out.println("num>>4 = " + (num >> 4));
    int num2 = 10;
    System.out.println("num2<<1= " + (num2 << 1));
    System.out.println("num2<<2= " + (num2 << 2));
    System.out.println("num2<<3= " + (num2 << 3));
    System.out.println("num2<<27= " + (num2 << 27));
    System.out.println("num2<<28= " + (num2 << 28));//过犹不及

    int num3 = -10;
    System.out.println("num3<<1= " + (num3 << 1));
    System.out.println("num3<<2= " + (num3 << 2));
    System.out.println("num3<<3= " + (num3 << 3));

//    **案例1：**高效的方式计算2 * 8的值（经典面试题）
    int num4 = 2 << 3;
    int num5 = 8 << 1;
    System.out.println("num4 = " + num4);
    System.out.println("num5 = " + num5);


  }
}
