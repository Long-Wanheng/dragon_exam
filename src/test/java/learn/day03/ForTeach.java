package learn.day03;

/**
 * ForTeach
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-01 22:43
 */
public class ForTeach {
    public static void main(String[] args) {
        /*
        * 思考题 ：
        *   执行下面的代码 写出为什么会打印出五行五列的小星星
        *   并且写出下面for循环嵌套的执行过程(讲出来即可)
        */
        for (int x = 1; x < 6; x++) {
            for (int y = 1; y < 6; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
