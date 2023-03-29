package top.gaopeng623.processControl;

/*
 * //阶段一：谷里记账软件的实现
 * */
public class GuLiAccount {
  public static void main(String[] args) {
    boolean isFlag = true;
    double money = 10000;
    String info = "";
    while (isFlag) {
      System.out.println("---------------谷立记账软件---------------");
      System.out.println("1。收支明细");
      System.out.println("2。登记收入");
      System.out.println("3。登记支出");
      System.out.println("4。退出");
      System.out.println("请选择1-4");
      char selection = Utility.readMenuSelection();
      switch (selection) {
        case '1':
          System.out.println("---------------当前收支明细---------------");
          System.out.println("收支     账户金额     收支明细       说明    ");
          System.out.println(info);
          break;
        case '2':
          System.out.println("请输入收入金额");
          int addMoney = Utility.readNumber();
          if (addMoney > 0) {
            money += addMoney;
          }
          System.out.println("请输入收入说明");
          String addDec = Utility.readString();
          info += "收入\t\t" + money + "\t\t" + addMoney + "\t\t" + addDec + "\n";
          break;
        case '3':
          System.out.println("请输入支出金额");
          int setMoney = Utility.readNumber();
          if (setMoney > 0 && money >= setMoney) {
            money -= setMoney;
          } else {
            System.out.println("余额不足");
            break;
          }
          System.out.println("请输入支出说明");
          String setDec = Utility.readString();
          info += "支出\t\t" + money + "\t\t" + setMoney + "\t\t" + setDec + "\n";
          break;
        case '4':
          System.out.println("确定退出输入‘Y’或’N’");
          if (Utility.readConfirmSelection() == 'Y') {
            System.out.println("欢迎下次光临~");
            isFlag = false;
          }
          break;
      }
    }

  }
}
