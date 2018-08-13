package factory.factory_method;

/**
 * create by 1311230692@qq.com on 2018/8/13 13:03
 * 客户提需求，工厂实例化
 **/
public class Customer {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createBMW();

        FactoryBMW532 factoryBMW532 = new FactoryBMW532();
        factoryBMW532.createBMW();
    }
}
