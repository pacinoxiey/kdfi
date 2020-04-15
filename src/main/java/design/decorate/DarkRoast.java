package design.decorate;

/**
 * @author xiey
 * @version 2020/4/13
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        super.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .89;
    }
}
