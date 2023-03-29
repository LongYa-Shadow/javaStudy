package top.gaopeng623.processControl;

import java.util.Map;

/*
题目：输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
*/
class ForTest1 {
  public static void main(String[] args) {
    //遍历所有的3位数
    for (int i = 100; i < 999; i++) {
      int ge = i % 10;
      int shi = i / 10 % 10;
      int bai = i / 100;

      //查看是否满足水仙花数的性质
      if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
        System.out.printf("%s是水仙花数%n", i);
      }
    }
    /*
     * 1234
     * ge = 1234%10
     *
     * */
    System.out.println(1234 / 1 % 10);
    System.out.println(1234 / 10 % 10);
    System.out.println(1234 / 100 % 10);
    System.out.println(1234 / 1000 % 10);
    //打印出四位数字中“个位+百位”等于“十位+千位”并且个位数为偶数，千位数为奇数的数字，并打印符合条件的数字的个数。
    for (int i = 1000; i < 9999; i++) {
      int ge = i % 10;
      int shi = i / 10 % 10;
      int bai = i / 100 % 10;
      int qian = i / 1000;
      if ((ge + bai) == (shi + qian) && (ge % 2) == 0 && qian % 2 != 0) {
        System.out.printf("个%s,十%s,百%s,千%s=%s%n", ge, shi, bai, qian, i);
      }
    }

  }
}
