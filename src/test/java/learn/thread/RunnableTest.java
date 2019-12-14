package learn.thread;

/**
 * RunnableTest
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-14 16:08
 */
public class RunnableTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable线程启动");
            }
        });
        thread.start();
    }
}
