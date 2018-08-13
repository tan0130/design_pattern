package strategy;

/**
 * create by 1311230692@qq.com on 2018/8/13 13:44
 * 生产奥迪车型
 **/
public abstract class AudiCar {
    private String name;
    public abstract void createAudiCar();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class AudiA4 extends AudiCar {
    @Override
    public void createAudiCar() {
        System.out.println("策略模式...制造 AudiA4 车型");
    }
}

class AudiA6 extends AudiCar {
    @Override
    public void createAudiCar() {
        System.out.println("策略模式...制造 AudiA6 车型");
    }
}
