package old.design.code.factorydesign.factory;

import old.design.code.factorydesign.behavior.ILogin;
import old.design.code.factorydesign.behavior.IUser;
import old.design.code.factorydesign.behavior.OracleLogin;
import old.design.code.factorydesign.behavior.OracleUser;

/**
 * @author xiey
 * @date 2019/7/12 10:11
 * @description：
 */
public class OracleFactory implements IFactory {
    @Override
    public IUser getUser() {
        return new OracleUser();
    }

    @Override
    public ILogin getLogin() {
        return new OracleLogin();
    }
}
