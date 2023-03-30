package top.gaopeng623.Arrary.two.Exer;

/*
*
*
案例：声明：int[] x,y[]; 在给x,y变量赋值以后，以下选项允许通过编译的是：

声明：int[] x,y[]; 在给x,y变量赋值以后，以下选项允许通过编译的是：
a)    x[0] = y;     no
b)    y[0] = x;     yes
c)    y[0][0] = x;  no
d)    x[0][0] = y;  no
e)    y[0][0] = x[0];yes
f)    x = y;        no

提示：
一维数组：int[] x  或者int x[]
二维数组：int[][] y 或者  int[] y[]  或者 int  y[][]
* */
public class Exer2 {
  public static void main(String[] args) {
    int[] ints = new int[10];
    short[] shorts = new short[10];
    //ints = shorts;//编译不通过，类型不一致
    int arr1[][] = new int[2][];
    int arr2[] = new int[2];
//    arr1 = arr2;//维度不一致


  }
}
