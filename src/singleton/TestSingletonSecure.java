package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * create by 1311230692@qq.com on 2018/8/13 11:10
 * 在多线程的环境下验证饿汉式单例的安全性
 **/
public class TestSingletonSecure {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + Singleton.getInstance());
                }
            });
        }
        executorService.shutdown();
    }
}
