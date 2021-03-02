package old.design.code.builder;

/**
 * @author xiey
 * @version 2019/7/12 16:05
 * 具体某种类型的组装
 */
public class BikeBuilder extends Builder {

    @Override
    void buildFrame() {
        /*
         * 使用工厂模式拓展
         */
//        product.setTire();
        System.out.println("已组装框架");
    }

    @Override
    void buildSeat() {
        System.out.println("已组装座位");
    }

    @Override
    void buildTire() {
        System.out.println("已组装轮胎");
    }
}
