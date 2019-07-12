package design.code.factorydesign.common.behavior;

/**
 * @author xiey
 * @date 2019/7/12 10:32
 * @description：
 */
public class MysqlLogin implements ILogin {
    @Override
    public void login() {
        System.out.println("在mysql登录...");
    }
}
