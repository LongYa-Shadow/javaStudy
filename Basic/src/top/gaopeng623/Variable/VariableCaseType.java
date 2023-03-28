package top.gaopeng623.Variable;

public class VariableCaseType {
  /*
   *   强制类型转换
   *    规则：
   *      1.如果需要将容量大的变量的类型转换为容量小的变量类型，需要使用强制类型转换
   *      2.强制类型转换需要使用强转符:().在()内指明数据类型
   * */
  public static void main(String[] args) {
    double d1 = 12;
//    int i1 = d1;//语法错误
    int i2 = (int) d1;
    System.out.println("i2 = " + i2);

    long l1 = 123;
//    short s1 = l1;//编译失败
    short s2 = (short) l1;
    System.out.println("s2 = " + s2);

    //练习
    int i3 = 132;
    float f1 = i3;//自动类型转换
    float f2 = (float) i3;//会自动进行类型转换，可以省略(float)

    //精度损失的例子1
    double d2 = 12.8;
    int i4 = (int) d2;
    System.out.println("i4 = " + i4);
    //精度损失的例子2
    int i5 = 128;
    byte b1 = (byte) i5;
    System.out.println("b1 = " + b1);

  }
}
