package top.gaopeng623.Variable;

/*
 * 变量的使用
 *    1.变量的理解：内存中的一个存储区域、该区域数据可在同一类型范围不断变换
 *    2.变量构成的三个要素：数据类型 变量名 存储的值
 *    3.Java中变量格式：数据类型 变量名 = 变量值（或先定义再赋值）
 *    4.Java的变量按照数据类型来分类：
 *      基础数据类型(8种)：
 *        整形：int\byte\short\long
 *        浮点型：float\double
 *        字符型：char
 *        布尔型: boolean
 *     引用数据类型：
 *        类(Class)
 *        数组(Array)
 *        接口(Interface)
 *        枚举(enum)
 *        注解(annotation)
 *        记录(record)
 *    5.定义变量时要遵守标识符命名的规则和规范。
 *      - 由26个英文字母组合，0-9，——或$组成
 *      - 数字不可开头
 *      - 不可使用关键字和保留字
 *      - Java中严格区分大小写，
 *      - 标识符不能包含空格
 *    6.说明
 *      - 变量都有其作用域，变量值在其作用域生效，除了就失效了
 *      - 在同一个作用域不可以声明两个同名的变量
 *      - 定义好变量名后，就可以通过变量名进行调用或运算
 *      - 变量值在赋值时，必须要满足变量的数据类型，并且在数据类型的有效范围变化
 * */
public class VariableTest {
  public static void main(String[] args) {
    int num;
    num = 1;
    System.out.println(num);
  }
}
