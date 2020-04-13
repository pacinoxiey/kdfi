package design.decorate;

/**
 * @author xiey
 * @version 2020/4/13
 */
public abstract class Beverage {

    public String descirption = "unknow beverage";

    public abstract double cost();

    String getDescirption() {
        return descirption;
    }
}
