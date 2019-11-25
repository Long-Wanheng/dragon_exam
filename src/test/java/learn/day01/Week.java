package learn.day01;

/**
 * Week
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-25 23:43
 */
public class Week {

    public static void main(String[] args) {
        /*
        *  while(){} 跟 do{}while()的区别
        *
        *  while(){}是先判断条件然后再去执行,只有当()中的表达式为true时(如  2 / 1 = 2)才会执行
        *
        *  do{}while()是先执行再去判断条件
        *   因此do{}while()肯定会执行，并且至少执行一次
        *
        *
        * */
        int today = 0;
        do {
            ++today;
            System.out.println("今天星期" + today);
        } while (today < 7);
    }
}
