package design.code.builder;

/**
 * @author xiey
 * @date 2019/7/12 16:41
 * @description：
 */
public class Main {

    public static void main(String[] args) {


        Builder builder = new BikeBuilder();

        /**
         * 组装过程全部封装
         */
        Director director = new Director(builder);

        /**
         * 产品生产完毕
         */
        director.construct();

    }
}
