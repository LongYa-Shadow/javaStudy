package top.gaopeng623.Arrary.one;

/**
 * 一维数组的基本使用(承接OneArrayTest.java)
 *
 * @author shadow
 * @create 12:18
 */
public class OneArrayTest1 {

  public static void main(String[] args) {
    //5. 数组元素的默认初始化值
    int[] arr1 = new int[4];
    arr1[0] = 11;
    arr1[1] = 12;
    arr1[2] = 13;
    System.out.println("arr1 = " + arr1);

    //> 整型数组元素的默认初始化值：0
    int[] ints = new int[5];
    System.out.println(ints[1]);

    //> 浮点型数组元素的默认初始化值：0.0
    float[] floats = new float[5];
    System.out.println("floats[0] = " + floats[0]);
    double[] doubles = new double[5];
    System.out.println("doubles[0] = " + doubles[0]);
    //> 字符型数组元素的默认初始化值：0 (或理解为'\u0000')
    char[] chars = new char[5];
    System.out.println("chars[0] = " + chars[0]);

    //> boolean型数组元素的默认初始化值：false
    boolean[] booleans = new boolean[5];
    System.out.println("booleans[0] = " + booleans[0]);

    //> 引用数据类型数组元素的默认初始化值：null
    String[] strings = new String[5];
    System.out.println("strings[0] = " + strings[0]);


    //6. 数组的内存解析


  }
}
