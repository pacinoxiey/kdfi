package design.proxy.staticProxy;

/**
 * @author xiey
 * @version 2020/4/16
 * @Description: 静态代理类接口, 委托类和代理类都需要实现的接口规范。
 * 定义了一个猫科动物的两个行为接口，吃东西，奔跑。
 * 作为代理类 和委托类之间的约束接口
 */
public interface ICat {
    String eatFood(String foodName);

    boolean running();
}