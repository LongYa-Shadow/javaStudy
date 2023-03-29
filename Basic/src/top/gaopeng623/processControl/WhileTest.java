package top.gaopeng623.processControl;

import java.util.Random;
import java.util.Scanner;

/*
*
* ①初始化部分
  while(②循环条件部分)｛
      ③循环体部分;
      ④迭代部分;
  }
  执行过程：①-②-③-④-②-③-④-②-③-④-...-②
  说明：
  *   - while(循环条件)中循环条件必须是boolean类型。
      - 注意不要忘记声明④迭代部分。否则，循环将不能结束，变成死循环。
      - for循环和while循环可以相互转换。二者没有性能上的差别。实际开发中，根据具体结构的情况，选择哪个格式更合适、美观。
      - for循环与while循环的区别：初始化条件部分的作用域不同。
  *
* */
public class WhileTest {
  public static void main(String[] args) {
//    输出5行HelloWorld!
    int i = 1;
    while (i <= 5) {
      System.out.println("HelloWord");
      i++;
    }
    //遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
    int num = 1;//初始值
    int sum = 0;//记录1-100所有的偶数的和
    int count = 0;//记录1-100之间偶数的个数
    while (num <= 100) {
      if (num % 2 == 0) {
        sum += i;
        count++;
      }
      num++;
    }
    System.out.println("偶数的总和为：" + sum);
    System.out.println("偶数的个数为：" + count);

    //随机生成一个100以内的数，猜这个随机数是多少？
    //从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
    int num100 = new Random().nextInt(100) + 1;
    System.out.println(num100);
    //记录猜的次数
    int count100 = 1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一个数");
    int guess = scanner.nextInt();
    while (guess != num100) {
      if (guess > num100) {
        System.out.println("猜大了");
      } else {
        System.out.println("猜小了");
      }
      System.out.println("请输入一个0-100的数");
      guess = scanner.nextInt();
      count100++;
    }

    System.out.println("猜中了！");
    System.out.println("一共猜了" + count100 + "次");
    scanner.close();
  }
}
