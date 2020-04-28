package design.code.builder;

/**
 * @author xiey
 * @version 2019/7/12 16:40
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        builder.buildTire();
        return builder.getResult();
    }
}
