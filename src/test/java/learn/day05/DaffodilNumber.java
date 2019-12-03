package learn.day05;

/**
 * DaffodilNumber
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-03 22:15
 */
public class DaffodilNumber {
    public static void main(String[] args) {
        for (int x = 100; x <= 1000; x++) {
            //获取个位数
            int singles = x % 10;
            //获取十位数
            int ten = (x - singles) / 10 % 10;
            //获取百位数
            int hundreds = (x - ten) / 100 % 10;
            int number = (singles * singles * singles) + (ten * ten * ten) + (hundreds * hundreds * hundreds);
            if (number == x) {
                System.out.println(x + "是水仙花数");
            }
        }
    }
}
