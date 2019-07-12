package design.code.factorydesign.factory;

import design.code.factorydesign.behavior.ILogin;
import design.code.factorydesign.behavior.IUser;
import design.code.factorydesign.behavior.MysqlLogin;
import design.code.factorydesign.behavior.MysqlUser;

/**
 * @author xiey
 * @date 2019/7/12 10:10
 * @description：
 */
public class MysqlFactory implements IFactory {
    @Override
    public IUser getUser() {
        return new MysqlUser();
    }

    @Override
    public ILogin getLogin() {
        return new MysqlLogin();
    }
}
