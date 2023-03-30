package top.gaopeng623.Arrary.two;

/*
 * 二维数组的基本使用（难点） （承接TwoArrayTest.java）
 *
 *  @author 尚硅谷-宋红康
 *  @create 13:18
 *
 */

public class TwoArrayTest1 {
  public static void main(String[] args) {

    //5. 数组元素的默认初始化值
    String[][] strs = new String[3][4];
    System.out.println(strs[0]);//地址值
    System.out.println(strs[0][0]);//null 为赋值
    //00000000000000000000000
    double[][] doubles = new double[2][];
    System.out.println(doubles[0]);//null
//    System.out.println(doubles[0][0]);//空指针异常
    //6. 数组的内存解析


  }
}
