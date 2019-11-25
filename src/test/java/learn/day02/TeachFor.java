package learn.day02;

/**
 * TeachFor
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-26 00:02
 */
public class TeachFor {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            System.out.println("第" + i + "次循环");
        }
        /*
        * 在上述例子中
        * int i = 1;是for循环的初始化部分
        * i <= num 是for循环的条件 只有满足条件才会执行{}里面的内容
        * i++ 为每执行一次for循环后的操作
        *  他的执行顺序是 先执行 int i = 1
        *  然后判断 i <= num
        *  因为先执行了 int i = 1;
        *  所以此时 i的值是 1
        *   1 <= 10
        *   所以执行一次
        *   System.out.println("第" + 1 + "次循环");
        *   然后执行 i++;
        *   此时 i的值变成了 2
        *   然后去再去判断 i < = num
        *   2 <= 10
        *   所以执行一次
        *   System.out.println("第" + 2 + "次循环");
        *   当第十次
        *   System.out.println("第" + i + "次循环");
        *   执行结束后
        *   (每执行完一次System.out.println("第" + i + "次循环");都会执行一次 i++)
        *   再去执行i++操作 此时 i的值为11
        *   然后去判断 i <= num;
        *   因为 11 <=10 这个条件不成立
        *   所以不会再去执行System.out.println("第" + i + "次循环");
        *   因此 上面的for循环例子只会执行10次
        */
    }
}
