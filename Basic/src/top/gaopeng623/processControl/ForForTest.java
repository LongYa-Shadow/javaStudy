package top.gaopeng623.processControl;

/*
 * 嵌套循环
 *
    - **所谓嵌套循环**，是指一个循环结构A的循环体是另一个循环结构B。比如，for循环里面还有一个for循环，就是嵌套循环。其中，for ,while ,do-while均可以作为外层循环或内层循环。
      - 外层循环：循环结构A
      - 内层循环：循环结构B
    - 实质上，`嵌套循环就是把内层循环当成外层循环的循环体`。只有当内层循环的循环条件为false时，才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的外层循环。
    - 设外层循环次数为`m`次，内层为`n`次，则内层循环体实际上需要执行`m*n`次。
    - 技巧：从二维图形的角度看，外层循环控制`行数`，内层循环控制`列数`。
    - 开发经验：实际开发中，我们最多见到的嵌套循环是两层。一般不会出现超过三层的嵌套循环。如果将要出现，一定要停下来重新梳理业务逻辑，重新思考算法的实现，控制在三层以内。否则，可读性会很差。

    例如：两个for嵌套循环格式
    for(初始化语句①; 循环条件语句②; 迭代语句⑦) {
    for(初始化语句③; 循环条件语句④; 迭代语句⑥) {
      	循环体语句⑤;
    }
    执行特点：**外层循环执行一次，内层循环执行一轮。
}

 * */
public class ForForTest {
  public static void main(String[] args) {
    //打印5行6个 *
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //打印5行直角三角形
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
    System.out.println("---------------------");
    //打印5行倒直角三角形
    for (int i = 5; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
    System.out.println("++++++++++++++++++++++");
    //打印"菱形"形状的图案
     /*
        上半部分		i		m(表示-的个数)    n(表示*的个数)关系式：2*i + m = 10 --> m = 10 - 2*i
    --------*		   1	   8			   1							n = 2 * i - 1
    ------* * *		   2	   6			   3
    ----* * * * *	   3	   4			   5
    --* * * * * * *	   4	   2		       7
    * * * * * * * * *  5	   0			   9

        下半部分         i      m                n              关系式： m = 2 * i-1
    * * * * * * * * *  1       0                9                     n = 9 - 2 * i
    --* * * * * * *    2       2                7
    ----* * * * *      3       4                5
    ------* * *        4       6                3
    --------*          5       8                1

      */
    //上半部分
    for (int i = 0; i < 5; i++) {
      //-
      for (int j = 0; j <= (10 - 2 * i); j++) {
        System.out.print("-");
      }
      //*
      for (int j = 0; j < (2 * i - 1); j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println("下下下");
    //下半部分
    for (int i = 0; i < 5; i++) {
      //-
      for (int j = 0; j <= (2 * i - 1); j++) {
        System.out.print("-");
      }
      //*
      for (int j = 0; j < (9 - 2 * i); j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    //九九乘法表
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + "*" + j + "=" + (i * j) + " ");
      }
      System.out.println();
    }

  }
}
