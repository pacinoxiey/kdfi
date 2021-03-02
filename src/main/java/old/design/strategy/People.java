package old.design.strategy;

/**
 * @author xiey
 * @version 2020/4/20
 * @description: 策略使用类
 */
public class People {

    //示例数据
    String[] ss = {"12345", "1234567890"};
//    StrategyType strategyType;
//    public People(StrategyType strategyType) {
//        this.strategyType = strategyType;
//    }

    public void print() {
        for (String s : ss) {
            System.out.println(s);
        }
    }

    public void print(Strategy strategy) {

        if (strategy == null) {
            return;
        }
        for (String s : ss) {
            if (strategy.accept(s)) {
                System.out.println(s);
            }
        }
    }
}
