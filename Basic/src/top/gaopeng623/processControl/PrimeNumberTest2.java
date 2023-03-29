package top.gaopeng623.processControl;

/*
 * 遍历100000以内的所有质数，体会不同的算法成本差别l
 * */
public class PrimeNumberTest2 {
  public static void main(String[] args) {

    //获取系统当前的时间
    long start = System.currentTimeMillis();
    boolean isFlag = true; //用于标识i是否被除尽过
    int count = 0;
    for (int i = 2; i <= 100000; i++) {
      //判断i是否被质数
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isFlag = false;
          break;//针对非质数
        }
      }
      if (isFlag) {
        count++;
      }
      //重置isFlag
      isFlag = true;
    }
    System.out.println("质数的总个数" + count);
    //获取系统当前的时间
    long end = System.currentTimeMillis();
    System.out.println("执行此程序花费的毫秒数为：" + (end - start)); //615
  }
}
