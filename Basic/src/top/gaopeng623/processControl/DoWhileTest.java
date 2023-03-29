package top.gaopeng623.processControl;

/*
循环结构之一：do-while循环


1. 凡是循环结构，就一定会有4个要素：
① 初始化条件
② 循环条件 ---> 一定是boolean类型的变量或表达式
③ 循环体
④ 迭代部分

2. do-while的格式

①
do{
	③
	④
}while(②);

执行过程：① - ③ - ④ - ② - ③ - ④ - .... - ②

3. 说明：
1) do-while循环至少执行一次循环体。
2) for、while、do-while循环三者之间是可以相互转换的。
3) do-while循环结构，在开发中，相较于for、while循环来讲，使用的较少。

*/
class DoWhileTest {
  public static void main(String[] args) {
    //遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
    //初始化部分
    int num = 1;
    int sum = 0;//记录1-100所有的偶数的和
    int count = 0;//记录1-100之间偶数的个数

    do {
      if (num % 2 == 0) {
        count++;
        sum += num;
      }
      num++;
    } while (num <= 100);
    System.out.println("偶数的总和为：" + sum);
    System.out.println("偶数的个数为：" + count);
    //******************
//    体会do-while至少会执行一次循环体
    int num1 = 10;
    while (num1 > 10) {
      System.out.println("while");
      num1--;
    }
    int num2 = 10;
    do {
      System.out.println("do while");
      num2--;
    } while (num2 > 10);
  }
}

