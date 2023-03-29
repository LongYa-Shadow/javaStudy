package top.gaopeng623.processControl;

import java.util.Scanner;

/*  如何从键盘获取不同类型（基本数据类型、String）的变量：使用Scanner类
 *    1. 使用Scanner获取不同类型数据的步骤
 *      - 导包import java.util.Scanner
 *      - 创建一个Scanner类的实例
 *      - 调用Scanner类的方法，获取指定类型的变量
 *      - 关闭资源，调用Scanner类的close()
 *    2. 案例：小明注册某交友网站，要求录入个人相关信息。如下：
        请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。
      3. Scanner提供了byte、short、int、long、Boolean、float、double获取数据的next方法
      *   但是没有提供char类型的
 * */
public class ScannerTest {
  public static void main(String[] args) {
    //② 创建Scanner的对象
    //Scanner是一个引用数据类型，它的全名称是java.util.Scanner
    //scanner就是一个引用数据类型的变量了，赋给它的值是一个对象（对象的概念我们后面学习，暂时先这么叫）
    //new Scanner(System.in)是一个new表达式，该表达式的结果是一个对象
    //引用数据类型  变量 = 对象;
    //这个等式的意思可以理解为用一个引用数据类型的变量代表一个对象，所以这个变量的名称又称为对象名
    //我们也把scanner变量叫做scanner对象
    Scanner scanner = new Scanner(System.in);
    //③根据提示，调用Scanner的方法，获取不同类型的变量
    System.out.println("欢迎光临你好我好交友网站！");
    System.out.print("请输入你的网名：");
    String name = scanner.next();
    System.out.print("请输入你的年龄：");
    int age = scanner.nextInt();
    System.out.print("请输入你的体重：");
    double weight = scanner.nextDouble();
    System.out.print("你是否单身（true/false)：");
    boolean isSingle = scanner.nextBoolean();
    System.out.print("请输入你的性别：");
    char gender = scanner.next().charAt(0);//先按照字符串接收，然后再取字符串的第一个字符（下标为0）
    System.out.println("你的基本情况如下：");
    System.out.println("网名：" + name + "\n年龄：" + age + "\n体重：" + weight + "\n单身：" + isSingle + "\n性别：" + gender);
    //关闭资源
    scanner.close();

  }
}
