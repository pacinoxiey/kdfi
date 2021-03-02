package old.design.code.factorydesign;

import old.design.code.factorydesign.behavior.ILogin;
import old.design.code.factorydesign.behavior.IUser;
import old.design.code.factorydesign.factory.EasyFactory;
import old.design.code.factorydesign.factory.IFactory;
import old.design.code.factorydesign.factory.MysqlFactory;

/**
 * @author xiey
 * @date 2019/7/12 10:16
 * @description：
 */
public class Main {

    /**
     * 实现类即为拥有相同属性, 不同实现的作品, 父类即为工厂
     * 普通工厂模式: 抽象出一类对象的相同属性(mysql和oracle中的user), 用不同实例实现, 再通过父类引用需要的子类
     */
    public static void main(String[] args) {

        User user = new User("test", 1);


        /**
         * 统一指定了数据库, 更换了数据库只需要修改子类实列, 不影响后续的操作
         */
        IFactory factory = new MysqlFactory();

        /**
         * 但是在实际操作中会每次都要指定数据库, 我们把这一步配置到factory中, 集成MysqlFactory, OracleFactory的方法
         * 直接得到实际的数据库访问实例，而不存在任何依赖
         */
        IUser easyUserOperation = EasyFactory.createUser();
        easyUserOperation.getUser(1);
        easyUserOperation.insert(user);


        IUser userOperation = factory.getUser();
        ILogin login = factory.getLogin();
        login.login();
        userOperation.getUser(1);
        userOperation.insert(user);

    }
}
