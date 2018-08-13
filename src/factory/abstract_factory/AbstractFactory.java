package factory.abstract_factory;

/**
 * create by 1311230692@qq.com on 2018/8/13 13:26
 * 抽象工厂类
 **/
public interface AbstractFactory {
    AirCondition createAirContion();
    Engine createEngine();
}

// 创建具体工厂
class Factory320 implements AbstractFactory {
    @Override
    public AirCondition createAirContion() {
        return new AirCondition320();
    }

    @Override
    public Engine createEngine() {
        return new Engine320();
    }
}

class Factory532 implements AbstractFactory {
    @Override
    public AirCondition createAirContion() {
        return new AirCondition532();
    }

    @Override
    public Engine createEngine() {
        return new Engine523();
    }
}
