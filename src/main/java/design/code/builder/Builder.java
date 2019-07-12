package design.code.builder;

/**
 * @author xiey
 * @date 2019/7/12 16:03
 * @description：
 */
public abstract class Builder {

    //前置产品
    protected Bike product = new Bike();

    //返回产品对象
    public Bike getResult() {
        return product;
    }

    abstract void buildFrame();

    abstract void buildSeat();

    abstract void buildTire();

}
