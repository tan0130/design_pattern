package factory.factory_method;

/**
 * create by 1311230692@qq.com on 2018/8/13 11:27
 * 采用生产宝马车为例演示工厂模式
 **/

// 一个抽象产品
abstract class BMW {
    public BMW() {};
}

// 一个具体产品
class BMW320 extends BMW {
    public BMW320() {
        System.out.println("工厂方法模式...创建 BMW320");
    }
}

class BMW532 extends BMW {
    public BMW532() {
        System.out.println("工厂方法模式...创建 BMW532");
    }
}

