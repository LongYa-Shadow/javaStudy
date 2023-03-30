package top.gaopeng623.Arrary.one;

import java.sql.Array;

/**
 * 一维数组的基本使用
 *
 * @author shadow
 * @create 
 */
public class OneArrayTest {

  public static void main(String args[]) {
    //1. 数组的声明与初始化
    //静态初始化：数组变量的赋值与数组元素赋值同时进行
    double[] prices;
    prices = new double[]{12.12, 21.21, 14.12};
    //动态初始化：数组变量初始化和数组赋值操作分开进行
    String[] foods = new String[3];
    foods[0] = "虾子";
    foods[1] = "茄子";
    foods[2] = "袜子";

    //2. 数组元素的调用
    System.out.println(prices[0]);
    System.out.println(prices[prices.length - 1]);
//    System.out.println(prices[5]);//报错索引越界
    //3. 数组的长度
    System.out.println(prices.length);

    //4. 如何遍历数组
    for (int i = 0; i < prices.length; i++) {
      System.out.println(prices[i]);
    }


  }

}
