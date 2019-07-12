package design.code.factorydesign.common;

import design.code.factorydesign.common.behavior.IUser;
import design.code.factorydesign.common.factory.IFactory;
import design.code.factorydesign.common.factory.MysqlFactory;

/**
 * @author xiey
 * @date 2019/7/12 10:16
 * @description：
 */
public class Main {

    public static void main(String[] args) {

        User user = new User();

        /**
         * 父类引用指向子类实列, 通过指定不同的子类可以实现在不同数据库切换, 即为普通工厂的做法
         * 子类即为拥有相同属性, 不同实现的作品, 父类即为工厂
         * 普通工厂模式: 抽象出一类对象的相同属性(mysql和oracle中的user), 用不同实例实现, 再通过父类引用需要的子类
         */
        IFactory factory = new MysqlFactory();

        IUser userOperation = factory.getUser();

        userOperation.getUser(1);
        userOperation.insert(user);

    }
}
