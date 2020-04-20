package design.decorate;


/**
 * @author xiey
 * @version 2020/4/13
 */
public class Main {

    /**
     * 装饰者模式：
     * 含义：在不改动原来的对象的情况下，为其添加新的功能或者属性
     * 使用场景：拓展一个类的功能，或者动态添加功能或者删除功能
     * 优点：比继承灵活，在不改变原有对象的情况下，给一个对象拓展功能，而且继承必须在编译前就确定好，
     * 而使用装饰者可以在运行时确定，装饰者也建立在继承之上。符合开闭原则（类，模块，方法等）（对拓展开放，对修改关闭）
     * 缺点：会制造更多的代码，相比继承会创建更多的对象
     * 一句话描述如何实现：
     * 创建一个装饰超类，拥有抽象的具体类的抽象方法，继承筹集基类，并且注入一个抽象基类，
     * 装饰类继承装饰超类，并且注入具体类托管，在实现类中对于具体类的方法的结果进行加工，获取装饰的效果
     *
     * @param args
     */
    public static void main(String[] args) {
// 一杯DarkRoast，不需要调料
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 一杯DarkRoast，加双份Mocha和奶泡
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
