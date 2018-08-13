package singleton;

/**
 * create by 1311230692@qq.com on 2018/8/13 9:55
 * 23种设计模式之单例模式
 * 懒汉式;线程不安全
 * 懒汉式实现线程安全的方式：
 * 1.在 get 方法上同步
 * 2.使用双重检测
 * 3.使用静态内部类
 **/
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton() {};
    public static LazySingleton getInstance() {
        if (instance == null) {
            // 在多线程的环境下，可能被执行多次，造成线程不安全
            instance = new LazySingleton();
        }
        return instance;
    }

    // 在 get 方法上同步
    /*private static LazySingleton instance = null;
    private LazySingleton() {};
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }*/

    // 双重检测锁机制
    /*private static LazySingleton instance = null;
    private LazySingleton() {};
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized(LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }*/

    // 静态内部类加载
   /* private LazySingleton() {};
    private static class  LazyHolder {
        private static final LazySingleton instance = new LazySingleton();
    }
    public static LazySingleton getInstance() {
        return LazyHolder.instance;
    }*/
}
