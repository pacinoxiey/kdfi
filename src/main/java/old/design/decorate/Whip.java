package old.design.decorate;

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
        return this.beverage.getDescription() + ",whip";
    }

    @Override
    public double cost() {
        return 0.3 + this.beverage.cost();
    }
}
