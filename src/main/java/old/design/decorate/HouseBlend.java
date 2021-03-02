package old.design.decorate;

/**
 * 具体类型
 *
 * @author xiey
 * @version 2020/4/13
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBend coffee";
    }

    @Override
    public double cost() {
        return 1.22;
    }
}
