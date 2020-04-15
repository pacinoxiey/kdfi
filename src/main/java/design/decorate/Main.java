package design.decorate;

/**
 * @author xiey
 * @version 2020/4/13
 */
public class Main {

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
