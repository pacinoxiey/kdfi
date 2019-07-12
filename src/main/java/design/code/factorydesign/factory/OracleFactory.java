package design.code.factorydesign.factory;

import design.code.factorydesign.behavior.ILogin;
import design.code.factorydesign.behavior.IUser;
import design.code.factorydesign.behavior.OracleLogin;
import design.code.factorydesign.behavior.OracleUser;

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
