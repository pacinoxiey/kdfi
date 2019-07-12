package design.code.factorydesign.behavior;

import design.code.factorydesign.User;

/**
 * @author xiey
 * @date 2019/7/12 10:05
 * @description：
 */
public class MysqlUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("向mysql插入一个用户");
    }

    @Override
    public User getUser(int id) {
        System.out.println("从mysql查询一个用户");
        return new User("mysql", 18);
    }
}
