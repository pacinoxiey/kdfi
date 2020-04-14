package design.decorate;

/**
 * @author xiey
 * @version 2020/4/13
 */
public class Main {

    public static void main(String[] args) {
        //基本
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescirption() + " ￥" + beverage.cost());
        //装饰
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(new Whip(new Soy(beverage3)));
//        darkRoast = new Mocha(darkRoast);
//        darkRoast = new Whip(darkRoast);
        System.out.println(beverage3.getDescirption() + " ￥" + beverage3.cost());


    }
}
