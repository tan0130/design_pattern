package strategy;

/**
 * create by 1311230692@qq.com on 2018/8/13 14:05
 * 客户根据需求，在客户端实例对象
 **/
public class Customer {
    public static void main(String[] args) {
        // 客户提取 AudiA4
        AudiCar audiCar = new AudiA4();
        audiCar.setName("A4");

        AudiCarContext audiCarContext = new AudiCarContext(audiCar);
        audiCarContext.orderCar();

        // 客户提取 AudiA6
        AudiCar audiCar1 = new AudiA6();
        audiCar1.setName("A6");

        AudiCarContext audiCarContext1 = new AudiCarContext(audiCar1);
        audiCarContext1.orderCar();
    }
}
