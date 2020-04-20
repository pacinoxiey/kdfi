package design.strategy;

/**
 * @author xiey
 * @version 2020/4/20
 * @description: 具体策略， 实现抽象策略类
 */
public class StrategyType implements Strategy {
    @Override
    public Boolean accept(String arg) {
        /**
         * 具体策略逻辑，不同策略新建不同的策略实现类
         */
        if (arg.length() > 5) {
            return true;
        }
        return false;
    }
}
