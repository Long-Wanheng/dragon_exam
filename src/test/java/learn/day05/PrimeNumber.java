package learn.day05;

/**
 * PrimeNumber
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-03 22:16
 */
public class PrimeNumber {
    public static void main(String[] args) {
        /*
        * 打印101-200之间的素数
        *  素数就是质数 即只能被1跟他本身整除的数
        *
        *
        * 下面代码 最外面的for循环是从101-200一个数一个数的遍历
        *
        *   在第一个for里面 定义了一个boolean类型的变量
        *   然后再第二个for循环开始 遍历从2到这个数本身-1
        *
        *   如果这个数从2到他本身有一个能被整除(能整除的，他们的余数肯定是0)
        *   那这个数就不是素数 跳出内循环，如果2到他本身-1还没有能被整除的，那他肯定是质数
        */
        for (int x = 101; x < 201; x++) {
            boolean isPrimeNumber = true;
            for (int y = 2; y < x; y++) {
                if (x % y == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(x + "是质数");
            }
        }
    }
}
