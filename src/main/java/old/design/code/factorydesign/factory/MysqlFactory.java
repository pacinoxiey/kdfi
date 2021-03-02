package old.design.code.factorydesign.factory;

import old.design.code.factorydesign.behavior.ILogin;
import old.design.code.factorydesign.behavior.IUser;
import old.design.code.factorydesign.behavior.MysqlLogin;
import old.design.code.factorydesign.behavior.MysqlUser;

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
