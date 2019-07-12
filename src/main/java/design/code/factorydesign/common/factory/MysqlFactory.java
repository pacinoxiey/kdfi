package design.code.factorydesign.common.factory;

import design.code.factorydesign.common.behavior.IUser;
import design.code.factorydesign.common.behavior.MysqlUser;

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
}
