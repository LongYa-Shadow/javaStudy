package top.gaopeng623.Variable;

import java.util.Arrays;

public class CharAndBoolean {
  //字符类型和布尔类型
  public static void main(String[] args) {
    /*
     * 1.char字符（2字节）
     * */
    //表示形式1：使用一对''表示，有且只能拥有一个
    char c1 = 'a';
    System.out.println("c1 = " + c1);
    char c2 = '中';
    char c3 = '1';
    char c4 = 'γ';
    //编译通不过
//    char c5 = '';
//    char c6 = 'ab';
    //表示形式2：直接使用Unicode值来表示字符常量：'\u0000'.
    char c7 = '\u0036';
    System.out.println("c7 = " + c7);
    //表示形式3：使用转义字符
    char c8 = '\n';
    char c9 = '\\';
    System.out.println("c8 = " + c8);
    System.out.println("c9 = " + c9);
    //表示形式4：
    char c10 = 91;
    System.out.println("c10 = " + c10);
    //布尔类型：boolean
    //只有两个值：true、false
    boolean b1 = true;
    boolean b2 = false;
    //java不允许，编译通不过
//    boolean b3 = 0;
    //布尔类型常使用于流程判断、循环结构
    boolean isMarried = true;
    if (isMarried) {
      System.out.println("很抱歉、不可以参加单身派对");
    } else {
      System.out.println("多来几个");
    }
  }
}
