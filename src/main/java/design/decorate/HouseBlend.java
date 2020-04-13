package design.decorate;

/**
 * 具体类型
 *
 * @author xiey
 * @version 2020/4/13
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        descirption = "HouseBend coffee";
    }

    @Override
    public double cost() {
        return .3;
    }
}