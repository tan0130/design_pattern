package factory.simple_factory;

/**
 * create by 1311230692@qq.com on 2018/8/13 11:39
 * 客户提需求，然后工厂进行实例化
 **/
public class Customer {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        BMW bmw320 = simpleFactory.createBMW(320);
        BMW bmw532 = simpleFactory.createBMW(532);
    }
}
