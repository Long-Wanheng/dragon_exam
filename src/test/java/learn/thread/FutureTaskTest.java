package learn.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * FutureTaskTest
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-14 16:11
 */
public class FutureTaskTest {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "futureTask线程";
            }
        });
        Thread thread = new Thread(task);
        thread.start();
        try {
            String result = task.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
