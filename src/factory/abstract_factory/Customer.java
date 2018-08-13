package factory.abstract_factory;

/**
 * create by 1311230692@qq.com on 2018/8/13 13:31
 * 客户提取求，工厂实例化对象
 **/
public class Customer {
    public static void main(String[] args) {
        // 生产 BMW320 系列的空调和发动机
        Factory320 factory320 = new Factory320();
        factory320.createAirContion();
        factory320.createEngine();

        // 生产 BMW532 系列的空调和发动机
        Factory532 factory532 = new Factory532();
        factory532.createAirContion();
        factory320.createEngine();

    }
}
