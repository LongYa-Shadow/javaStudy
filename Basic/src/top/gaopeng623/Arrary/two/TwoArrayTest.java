package top.gaopeng623.Arrary.two;

/**
 * 二维数组的基本使用（难点）
 *
 * @author 尚硅谷-宋红康
 * @create 13:08
 */
public class TwoArrayTest {
  public static void main(String[] args) {
    //1. 数组的声明与初始化
    //静态初始化:数组变量和数组元素的赋值同时进行
    int[][] ints = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //动态初始化1:数组变量和数组元素的赋值分开进行
    String[][] strs = new String[3][4];
    //动态初始化2
    double[][] doubles = new double[2][];
    //其他正确的写法
    int arr4[][] = new int[][]{{1, 2, 4}, {4, 5, 6}};
    int[] arr5[] = new int[][]{{1, 2, 4}, {4, 5, 6}};
    int arr6[][] = {{1, 2, 4}, {4, 5, 6}};//类型推断
    //错误的
    //int[][] arr7= new int[3][3]{{1, 2, 4}, {4, 5, 6}};
    //int[3][3] arr8= new int[][]{{1, 2, 4}, {4, 5, 6}};

    //2. 数组元素的调用
    System.out.println(ints[0]);//[I@4eec777
    System.out.println(ints[0][0]);
    System.out.println(ints[1][1]);
    System.out.println(ints[2][2]);

    //测试strs、doubles
    strs[0][0] = "shadow";
    System.out.println(strs[0]);//[Ljava.lang.String;@3b07d329
    System.out.println(strs[0][0]);

    doubles[0] = new double[5];
    doubles[0][0] = 12.2;
    System.out.println(doubles[0][0]);
//    System.out.println(doubles[1][0]);//未赋值、annot load from double array because "doubles[1]" is null
    //3. 数组的长度
    System.out.println(ints.length);//3?9?
    System.out.println(ints[0].length);//3

    //4. 如何遍历数组
    for (int i = 0; i < ints.length; i++) {
      for (int j = 0; j < ints[i].length; j++) {
        System.out.print(ints[i][j] + "\t");
      }
      System.out.print("\n");
    }


  }
}
