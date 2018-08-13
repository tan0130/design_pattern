package factory.abstract_factory;

/**
 * create by 1311230692@qq.com on 2018/8/13 13:22
 * 发动机抽象产品
 **/
abstract class Engine {
}

class Engine320 extends Engine {
    public Engine320() {
        System.out.println("抽象工厂模式...制造 BMW320 的发动机");
    }
}

class Engine523 extends Engine {
    public Engine523() {
        System.out.println("抽象工厂模式...制造 BMW523 的发送机");
    }
}
