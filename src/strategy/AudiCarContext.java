package strategy;

/**
 * create by 1311230692@qq.com on 2018/8/13 14:03
 * 销售部门...服务端
 **/
public class AudiCarContext {
    private AudiCar audiCar = null;
    AudiCarContext(AudiCar audiCar) {
        this.audiCar = audiCar;
    }
    void orderCar() {
        this.audiCar.createAudiCar();
    }

}
