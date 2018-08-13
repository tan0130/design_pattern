package singleton;

/**
 * create by 1311230692@qq.com on 2018/8/13 11:08
 * 饿汉式单例实现
 * 不会有线程安全的问题
 **/
public class Singleton {
    private Singleton() {};
    private static final Singleton instance = new Singleton(); // 还未使用就进行了初始化
    public static Singleton getInstance() {
        return instance;
    }
}
