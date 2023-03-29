package top.gaopeng623.operator;

//条件运算符练习
public class ConditionExer {
  public static void main(String[] args) {
    /*
    *
    * 案例3今天是周2，10天以后是周几？
        要求：控制台输出"今天是周2，10天以后是周x"。
    * */

    int week = 4;
    week += 10;
    week %= 7;
    System.out.println("今天是周2，10天以后是周" + ((week == 0) ? "日" : week));
  }
}
