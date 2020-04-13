package design.decorate;

/**
 * @author xiey
 * @version 2020/4/13
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescirption() + ",mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
