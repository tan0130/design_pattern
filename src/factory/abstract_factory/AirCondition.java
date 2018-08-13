package factory.abstract_factory;

/**
 * create by 1311230692@qq.com on 2018/8/13 13:17
 * 空调抽象产品
 **/
abstract class AirCondition {

}

class AirCondition320 extends AirCondition {
    public AirCondition320() {
        System.out.println("抽象工厂模式...制造 BMW320 的空调");
    }
}

class AirCondition532 extends AirCondition {
    public AirCondition532() {
        System.out.println("抽象工厂模式...制造 BMW532 的空调");
    }
}

