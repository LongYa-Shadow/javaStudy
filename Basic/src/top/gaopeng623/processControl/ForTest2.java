package top.gaopeng623.processControl;

public class ForTest2 {
  public static void main(String[] args) {
    int m = 12;
    int n = 20;

    //获取m和n中的较小值
    int min = (m < n) ? m : n;

    //需求1：最大公约数
    //方式1：
    int result = 1;
    for (int i = 1; i <= min; i++) {
      if (m % i == 0 && n % i == 0) {
        //System.out.println(i);
        result = i;
      }

    }

    System.out.println(result);

    //方式2：推荐
    for (int i = min; i >= 1; i--) {
      if (m % i == 0 && n % i == 0) {
        System.out.println("最大公约数为：" + i);
        break;//一旦执行，就跳出当前循环结构。
      }
    }

    //需求2：最小公倍数
    int max = (m > n) ? m : n;
    for (int i = max; i <= m * n; i++) {
      if (i % m == 0 && i % n == 0) {
        System.out.println("最小公倍数为：" + i);
        break;
      }
    }

    //打印1~100之间所有奇数的和
    int sum = 0;//记录奇数的和
    for (int i = 0; i < 100; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    System.out.println("奇数总和为：" + sum);

    //打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
    int sum2 = 0;//记录总和
    int count = 0;//记录个数
    for (int i = 0; i < 100; i++) {
      if (i % 7 == 0) {
        sum2 += i;
        count++;
      }
    }
    System.out.println("1~100之间所有是7的倍数的整数的和为：" + sum);
    System.out.println("1~100之间所有是7的倍数的整数的个数为：" + count);
    //编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”。
    for (int i = 0; i < 150; i++) {
      if (i % 3 == 0) {
        System.out.println("foo");
      }
      if (i % 5 == 0) {
        System.out.println("biz");
      }
      if (i % 7 == 0) {
        System.out.println("baz");
      }

    }
  }
}
