package design.decorate;

/**
 * @author xiey
 * @version 2020/4/13
 */
public abstract class Beverage {

    protected String description = "unknow beverage";

    public abstract double cost();

    String getDescription() {
        return description;
    }
}
