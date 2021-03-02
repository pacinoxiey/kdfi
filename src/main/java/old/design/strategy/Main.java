package old.design.strategy;

/**
 * @author xiey
 * @version 2020/4/20
 * @description:
 */
public class Main {

    public static void main(String[] args) {

        People p = new People();
        System.out.println("不使用策略过滤");
        p.print();
        System.out.println("使用StrategyType过滤");
        p.print(new StrategyType());
        System.out.println("使用匿名参数类过滤");
        p.print(new Strategy() {
            @Override
            public Boolean accept(String arg) {
                if (arg.length() < 6) {
                    return true;
                }
                return false;
            }
        });
    }
}
