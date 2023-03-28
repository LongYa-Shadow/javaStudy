package top.gaopeng623.Variable;

public class VariableOperationalRules {
  /*
   * 基本数据类型变量间的运算规则
   *  1、这里提到可以做运算的基本数据类型有7种，不包含Boolean类型
   *  2、运算规则
   *    - 强制类型转换
   *    - 自动类型提升
   *
   *  规则：当容量小的变量与容量大的变量做运算时，结果会自动转换为容量大的数据类型
   *  byte、short、char---->int---->long---->float---->doublel
   *  特别的：byte、short、char类型的变量之间做运算、结果为int类型
   *  说明:只容量大小并非指所占内存空间大小、而是指表数范围的大小
   *    long(8byte) -(2E62)~(2E62)-1 || float(4byte) -3.403E38~(3.403E38)-1
   * */
  public static void main(String[] args) {
    byte b1 = 127;
    short s1 = b1;
    int i1 = s1;
    long l1 = i1;
    float f1 = l1;
    //编译失败
    //byte b2 = f1;
    //*************************************************************
    //特殊情况1：byte和short做运算
    byte b2 = 13;
    short s2 = 20;
    //编译通不过
//    short s3 = b2 + s2;

    byte b3 = 29;
    //编译失败
    //byte b4 = b2 + b3;
    //特殊情况2：char
    char c1 = 'a';
    //编译失败
//    char c2 = c1 + b3;
    int i2 = c1 + b3;
    System.out.println("i2 = " + i2);
    //*************************************************************
    //练习一：
    long l2 = 123L;
    long l3 = 123;//理解为：自动类型提升（但数字为int类型(4byte)）int--->long
//    long l4 = 123123123123;//123123123123理解为int类型，超出了int类型的范围，所以保持错
    long l5 = 123123123123L;//此时的123123123123L就是使用8个byte存储的long类型的值
    //练习二：
    float f2 = 12.3F;
//    float f3 = 12.3;//不满足自动类型提升规则(double-->float).所以报错

    //练习三：
    //规定一：整数常量，规定是int类型
    byte b4 = 12;
//    byte b6 = b4 + 1;//1为int类型，所以报错。
    int i3 = b4 + 12;
    //规定二：浮点型常量，规定是double类型
    double d2 = b4 + 12.3;

    //练习四：说明为什么不允许变量名是数字开头，为了“自洽”
    /*
    int 123L = 12;
    long l6 = 123L;

*/
  }

}
