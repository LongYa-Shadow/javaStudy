package top.gaopeng623.Variable;

public class VariableString {
  /*
   * 基本数据类型与string的运算
   * 一、关于String的理解
   *  1.String类，属于引用数据类型。俗称字符串。
   *  2.String类型的变量，可以使用一对""的方式进行赋值
   *  3.String声明的字符串内部，可以包含0个或多个字符
   *
   * 二、String与基本数据类型变量间的运算
   *  1.基本数据类型包括布尔类型在内的8种
   *  2.String和基本数据类型变量之间只能做连接运算，使用"+"表示
   *  3.String不能转换为基本数据类型
   * */
  public static void main(String[] args) {
    String s1 = "hello world";
    System.out.println("s1 = " + s1);

    String s2 = "";
    String s3 = "a";
    //测试连接运算
    int num1 = 10;
    boolean b1 = true;
    String str1 = "hello";
    String s4 = num1 + str1;
    String s5 = b1 + str1;
    System.out.println("s5 = " + s5);
    String s6 = s1 + num1 + b1;
    System.out.println("s6 = " + s6);

//    String s7 = b1 + num1 + str1; //b1+num1不能连接
    //如何将String类型的变量转换为基本数据类型？
    String s7 = num1 + "";
    //使用Integer
    int num3 = Integer.parseInt(s7);
    System.out.println("num3 = " + num3);
    //练习
    //要求填写自己的姓名、年龄、性别、体重、婚姻状况(已婚用true表示，单身用false表示) 、联系方式等等
    String name = "李进";
    int age = 24;
    char gender = '男';
    double weight = 70;
    boolean isMarried = false;
    String phoneNumber = "13012341234";
    System.out.println("name = " + name + ",age = " + age + ",gender = " + gender + ",weight = " + weight + ",isMarried = " + isMarried + ",phoneNumber =" + phoneNumber);

    System.out.println(String.format("18的二进制值：%s,21的二进制值：%s,%s", Integer.toBinaryString(18), Integer.toBinaryString(21), Integer.toHexString(31)));

    //十进制转二进制
    /*  18/2      0
     *  9/2       1
     *  4/2       0
     *  2/2       0
     *  1
     *
     *  21/2      1
     *  10/2      0
     *  5/2       1
     *  2/2       0
     *  1
     *
     *  10101 1*2^4,0,1*2^2,0,1*2^0 16 + 4 + 1
     */

  }
}
