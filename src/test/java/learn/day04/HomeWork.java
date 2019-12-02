package learn.day04;

/**
 * HomeWork
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-02 23:15
 */
public class HomeWork {
    public static void main(String[] args) {
        /*
        打印图形
            1
            22
            333
            4444
            55555
        */
        for (int x = 1; x < 6; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
