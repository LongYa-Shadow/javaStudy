package top.gaopeng623.Arrary.one.Exer;


import java.util.Scanner;

/*
*
*
案例：学生考试等级划分

从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
	成绩>=最高分-10    等级为’A’
	成绩>=最高分-20    等级为’B’
	成绩>=最高分-30    等级为’C’
	其余              等级为’D’

提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
* */
public class ArrayExer2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //1、根据键盘输入的学生人数，创建数组（动态初始化）
    System.out.println("请输入学生人数");
    int students = scanner.nextInt();
    int[] studentsArr = new int[students];
    //2、根据提示：依次输入学生成绩，并将成绩包村在数组中
    for (int i = 0; i < studentsArr.length; i++) {
      System.out.println("请依次输入学生成绩");
      studentsArr[i] = scanner.nextInt();
    }
    //3、获取学生成绩最大值
    int max = 0;
    for (int i = 0; i < studentsArr.length; i++) {
      if (studentsArr[i] > max) max = studentsArr[i];
    }
    System.out.println("最高分是:" + max);
    //4、遍历数组元素，根据学生成绩与最高分的差值，得到每个学生的等级，并输出
    for (int i = 0; i < studentsArr.length; i++) {
      if (studentsArr[i] >= max - 10) {
        System.out.println("student " + i + " score is " + studentsArr[i] + " grade is A");
      } else if (studentsArr[i] >= max - 20) {
        System.out.println("student " + i + " score is " + studentsArr[i] + " grade is B");
      } else if (studentsArr[i] >= max - 30) {
        System.out.println("student " + i + " score is " + studentsArr[i] + " grade is C");
      } else {
        System.out.println("student " + i + " score is " + studentsArr[i] + " grade is D");
      }
    }


    scanner.close();
  }
}
