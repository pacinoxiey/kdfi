package design.proxy.cglib;

/**
 * @author xiey
 * @version 2020/4/21
 * 被代理类
 */
public class Dog {
    public String call() {
        System.out.println("wang wang wang");
        return "Dog ..";
    }
}
