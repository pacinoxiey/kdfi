package design.decorate;

/**
 * @author xiey
 * @version 2020/4/13
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescirption() + ",soy";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
