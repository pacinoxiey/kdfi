package design.code.factorydesign.behavior;

import design.code.factorydesign.User;

/**
 * @author xiey
 * @date 2019/7/11 15:04
 * @description： 用户行为接口类
 */
public interface IUser {

    void insert(User user);

    User getUser(int id);
}
