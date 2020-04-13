package design.decorate;

/**
 * @author xiey
 * @version 2020/4/13
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescirption() + ",whip";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
