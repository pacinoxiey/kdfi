package old.design.decorate;

/**
 * 具体类型
 *
 * @author xiey
 * @version 2020/4/13
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
