package top.gaopeng623.operator;


public class AriExer {
  public static void main(String[] args) {

    /*
    * 随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
        格式如下：
        数字xxx的情况如下：
        个位数：
        十位数：
        百位数：
        例如：
        数字153的情况如下：
        个位数：3
        十位数：5
        百位数：1
    *
    * */
    int n = 153;
    int ge = n % 10;
    System.out.println("ge = " + ge);
    int shi = n % 100 / 10;
    System.out.println("shi = " + shi);
    int bai = n / 100;
    System.out.println("bai = " + bai);
    //拓展：获取一个四位数的个位，十位，百位，千位
    //1.定义一个变量，赋值为一个四位数整数，例如1234
    int num = 1234;
    //2.通过运算操作求出个位，十位，百位，千位
    int ge2 = num % 10;
    int shi2 = num / 10 % 10;
    int bai2 = num / 100 % 10;
    int qian = num / 1000 % 10;

    System.out.println("个位上的数字是：" + ge2);
    System.out.println("十位上的数字是：" + shi2);
    System.out.println("百位上的数字是：" + bai2);
    System.out.println("千位上的数字是：" + qian);

    //**案例2：**为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
    int hours = 89;
    int day = hours / 24;
    int hour = hours % 24;
    System.out.println(String.format("天=%s,小时=%s", day, hour));

    //**********************************************
    //练习1：算术运算符：自加、自减
    int i1 = 10;
    int i2 = 20;
    int i = i1++;
    System.out.print("i=" + i); //10
    System.out.println("i1=" + i1);//11
    i = ++i1;
    System.out.print("i=" + i);//12
    System.out.println("i1=" + i1);//12
    i = i2--;
    System.out.print("i=" + i);//20
    System.out.println("i2=" + i2);//19
    i = --i2;
    System.out.print("i=" + i);//18
    System.out.println("i2=" + i2);//18

    //练习2：
    System.out.println("5+5=" + 5 + 5); //打印结果是？ 5+5=55 ?ture

    //练习3：
    byte bb1 = 127;
    bb1++;
    System.out.println("bb1 = " + bb1);//-128

    //练习4：
    int ii = 1;
    int j = ii++ + ++ii * ii++;//1+3*3
    System.out.println("j = " + j);

    //练习5：（企业真题）写出下列程序的输出结果
    int i5 = 2;
    int j5 = i5++;
    System.out.println(j5);

    int m = 2;
    m = m++; //(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
    System.out.println(m);

  }

}
