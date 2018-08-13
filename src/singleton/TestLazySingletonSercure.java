package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * create by 1311230692@qq.com on 2018/8/13 10:28
 * 在多线程的环境下验证懒汉式为什么不安全
 **/
public class TestLazySingletonSercure {
    public static void main(String[] args) {
        // 使用 FixedThreadPool 生成 10 个线程
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +":" + LazySingleton.getInstance());
                }
            });
        }
        executorService.shutdown();
    }
}
