package old.design.decorate.test;

/**
 * @author xiey
 * @version 2020/4/14
 */
public class Test1 extends Decorate {

    Base base;

    public Test1(Base base) {
        this.base = base;
    }

    @Override
    public String getDescription() {
        System.err.println("old.base:" + this.base.getDescirption());
        return base.getDescirption() + ",test1";
    }
}
