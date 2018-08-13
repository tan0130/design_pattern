package factory.simple_factory;

/**
 * create by 1311230692@qq.com on 2018/8/13 11:24
 * 简单工厂模式：
 * 工厂类中根据条件，决定接口由哪个具体产品类实现
 **/
public class SimpleFactory {
    public BMW createBMW(int type) {
        switch (type) {
            case 320:
                return new BMW320();
            case 532:
                return new BMW532();
            default:
                break;
        }
        return null;
    }
}
