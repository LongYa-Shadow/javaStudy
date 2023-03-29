package top.gaopeng623.processControl;


/*
*
* 题目：找出100以内所有的素数（质数）？100000以内的呢？

  目的：不同的代码的实现方式，可以效率差别很大。

  分析：素数（质数）：只能被1和它本身整除的自然数。 ---> 从2开始，到这个数-1为止，此范围内没有这个数的约数。则此数是一个质数。 比如：2、3、5、7、11、13、17、19、23、...
  换句话，从2开始到这个自然数-1为止，不存在自然数的约数
*
* */
public class PrimeNumberTest {
  public static void main(String[] args) {
    //方式一
    for (int i = 2; i < 100; i++) {
      //判断i是否被质数
      int num = 0;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          num++;
        }
      }
      if (num == 0) {
        System.out.println(i);
      }
    }
    //方式二
    boolean isFlag = true; //用于标识i是否被除尽过
    for (int i = 2; i < 100000; i++) {
      //判断i是否被质数
      for (int j = 2; j < i; j++) {
        if ((i % j) == 0) isFlag = false;
      }
      if (isFlag) {
        System.out.println(i);
      }
      //重置isFlag
      isFlag = true;
    }

  }
}
