package top.gaopeng623.Variable;

public class PlasticAndFloat {
  public static void main(String[] args) {
    /*
     * 1、整形类型：byte、short、int、long
     *   类型     占用存储空间      表数范围
     *   byte    1字节=8bit位     -128~127
     *   short   2字节           -(2E15)~(2E15)-1
     *   int     4字节           -2E31)~(2E31)-1(约21亿)
     *   long    8字节           -(2E62)~(2E62)-1
     * 2、浮点类型：float、double
     *    类型     占用存储空间      表数范围
     *    float   4字节            -3.403E38~(3.403E38)-1
     *    double  8字节            -1.798E308~(1.798E308)-1
     * */
    byte b1 = 0;
    byte b2 = -128;
    //编译通不过，因为超出了byte存储范围
    //    byte b3 = 128;

    short s1 = 1234;
    int i1 = 1234567890;
    //声明long类型变量时，需要提供后缀、后缀为'l'和'L'
    long l1 = 1234567890L;
    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);
    System.out.println("s1 = " + s1);
    System.out.println("i1 = " + i1);
    System.out.println("l1 = " + l1);

    double d1 = 12.3;
    //声明float型变量时，需要提供后缀、后缀为'f'和'F'
    float f1 = 13.3f;
    // 开发中，大家定义浮点型变量时，没有特殊情况的话，通常都声明为double类型，因为精度更高。
    //float类型表数范围要大于long类型表数范围，但是精度不高
    System.out.println("d1 = " + d1);
    System.out.println("f1 = " + f1);

    //测试浮点型变量精度
    System.out.println(0.1 + 0.2);//0.30000000000000004
    float ff1 = 123123f;
    float ff2 = ff1;
    System.out.println(ff1);
    System.out.println(ff2);
    System.out.println(ff1 == ff2);

    //案例1: 定义圆周率并赋值为3.14，现有3个圆的半径分别为1.2、2.5、6，求它们的面积。
    //定义圆周率
    double pi = 3.14;
    //定义圆的半径
    double radius1 = 1.2;
    double radius2 = 2.5;
    int radius3 = 6;
    //计算面积
    double area1 = pi * radius1 * radius1;
    double area2 = pi * radius2 * radius2;
    double area3 = pi * radius3 * radius3;

    System.out.println("圆周率为" + pi + "面积为" + area1);
    System.out.println("圆周率为" + pi + "面积为" + area2);
    System.out.println("圆周率为" + pi + "面积为" + area3);

    //案例2: 小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。它需要一个程序将华氏温度(80度) 转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度
    //°C=(°F - 32) / 1.8
    double hua = 80.0;

    double she = (hua - 32) / 1.8;
    System.out.println("华氏度" + hua + "°F 对应的摄氏度为" + she + "°C");
  }


}
