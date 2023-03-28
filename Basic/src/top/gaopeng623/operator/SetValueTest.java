package top.gaopeng623.operator;

/*
 * 赋值运算符
 *  符号：=
 *    - 当“=”两侧数据类型不一致时，可以使用自动类型转换或使用强制类型转换原则进行处理。
      - 支持连续赋值。
 *  扩展赋值运算符： +=、 -=、*=、 /=、%=
 *    - 扩展赋值运算符不会改变变量本身数据类型
 * */
public class SetValueTest {
  public static void main(String[] args) {
    int n = 5;
    long l = 1;//自动类型提升
    byte b = (byte) l;//强制类型转换

    //连续赋值
    int a1;
    int a2;
    //或合并int a1, a2;
    a2 = a1 = 10;
    System.out.println("a1 = " + a1);
    System.out.println("a2= " + a2);
    //或合并且赋值
    int a3 = 10, a4 = 20;
    System.out.println("a3 = " + a3);
    System.out.println("a4 = " + a4);


    //***************************************************
    //说明+=的使用
    int m1 = 10;
    m1 += 5; //类似于 m1 = m1 + 5
    System.out.println("m1 = " + m1);

    //举例一
    byte by1 = 2;
    by1 += 3;//by1 = by1 + 3 操作会编译报错。应改写成:by1 =(byte)( by1 + 3)
    System.out.println("by1 = " + by1);

//    练习1：如何实现变量值增加为2
    int n1 = 10;
//    n1 = n1 + 2;
    n1 += 2;//推荐
    System.out.println("n1 = " + n1);
  }

}
