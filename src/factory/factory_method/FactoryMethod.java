package factory.factory_method;

/**
 * create by 1311230692@qq.com on 2018/8/13 11:48
 * 工厂方法模式
 **/
interface FactoryMethod {
    BMW createBMW();
}

class FactoryBMW320 implements FactoryMethod {
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}

class FactoryBMW532 implements FactoryMethod {
    @Override
    public BMW532 createBMW() {
        return new BMW532();
    }
}
