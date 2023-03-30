package top.gaopeng623.Arrary.two.Exer;

/*
*
*
    案例1：获取arr数组中所有元素的和。
    提示：使用for的嵌套循环即可。
*
* */
public class Exer1 {
  public static void main(String[] args) {
    //初始化数组:静态初始化
    int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
      }
    }
    System.out.println("arr数组中所有元素的和=" + sum );
  }
}
