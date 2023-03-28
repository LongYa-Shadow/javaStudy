package top.gaopeng623.operator;


public class AriTest {
  public static void main(String[] args) {
    /*算术运算符的使用
     *   1.+ - + - * / % （前）++  （后）++ （前）-- （后）-- +
     * */
    //除法：/
    //乘法：*
    int m1 = 15;
    int n1 = 4;
    int k1 = m1 / n1;
    System.out.println("k1 = " + k1);//3
    System.out.println(m1 / n1 * n1);//12

    //取模（或取余）：%
    int k2 = m1 % n1; //
    System.out.println("k2 = " + k2);//3
    //开发中我们通常判断某个数能整除某个数  num1%num2==0
    //比如判断num1是不是偶数：num1%2==0     num1%2!=0

    int m2 = -15;
    int n2 = 4;
    System.out.println(m2 % n2);//-3

    int m3 = 15;
    int n3 = -4;
    System.out.println(m3 % n3);//3

    int m4 = -15;
    int n4 = -4;
    System.out.println(m4 % n4);//-3
    //结论：取模以后，结果与被模数的符号相同
    //*****************************
    //前++ 先自增1、后运算
    //后++ 先运算、在自增1
    int a1 = 10;
    int b1 = a1++;
    System.out.println(String.format("a1=%s,a1++=%s", a1, b1));//11  10
    int a2 = 10;
    int b2 = ++a2;
    System.out.println(String.format("a2=%s,++a2=%s", a2, b2));//11 11

    //练习一
    int i = 10;
//    i++;
    ++i;
    System.out.println("i = " + i);//11

    //练习二
    short s = 10;
    //方式一
//    s = s + 1;//类型错误
//    s = (short) (s + 1);
//    System.out.println("s = " + s);
    //方式二
    s++;
    System.out.println("s = " + s);

    //***********************
    //前-- 先自减1、后运算
    //后-- 先运算、在自减1
    //。。。。。。

    //+：连接符，只适用于String与其他类型变量间做运算、而且运算结果也是String类型
  }
}
