package learn.thread;

/**
 * ThreadTest
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-14 16:05
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread("线程threadA------") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "跑起来了");
            }
        };
        thread.start();
    }
}
