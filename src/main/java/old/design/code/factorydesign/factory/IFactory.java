package old.design.code.factorydesign.factory;

import old.design.code.factorydesign.behavior.ILogin;
import old.design.code.factorydesign.behavior.IUser;

/**
 * @author xiey
 * @date 2019/7/11 15:04
 * @description： 工厂
 */
public interface IFactory {

    IUser getUser();

    /**
     * 数据库里有多个表, 就添加多个接口
     *
     * @return
     */
    ILogin getLogin();
}
