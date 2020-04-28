package design.code.builder;

/**
 * @author xiey
 * @version 2019/7/12 16:03
 * 抽象出具体需要的功能/配置
 */
public abstract class Builder {

    //前置产品
    protected Bike product = new Bike();

    //返回产品对象
    public Bike getResult() {
        System.out.println("自行车生产完毕");
        return product;
    }

    abstract void buildFrame();

    abstract void buildSeat();

    abstract void buildTire();

}
