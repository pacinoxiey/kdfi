package old.design.proxy.staticproxy;

/**
 * @author xiey
 * @version 2020/4/16
 * @description: 饲养员 实现Cat接口，作为静态代理类实现。代理狮子的行为。
 * 代理类中可以新增一些其他行为，在实践中主要做的是参数校验的功能。
 */
public class FeederProxy implements ICat {
    private ICat cat;

    public FeederProxy() {
    }

    public FeederProxy(ICat cat) {
        if (cat != null) {
            this.cat = cat;
        }
    }

    public void setCat(ICat cat) {
        if (cat != null) {
            this.cat = cat;
        }
    }

    @Override
    public String eatFood(String foodName) {
        System.out.println("proxy Lion exec eatFood ");//代理存在的意义就是添加公共的逻辑代码
        return cat.eatFood(foodName);
    }

    @Override
    public boolean running() {
        System.out.println("proxy Lion exec running.");
        return cat.running();
    }
}
