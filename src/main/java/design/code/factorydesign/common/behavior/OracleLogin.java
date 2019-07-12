package design.code.factorydesign.common.behavior;

/**
 * @author xiey
 * @date 2019/7/12 10:33
 * @description：
 */
public class OracleLogin implements ILogin {
    @Override
    public void login() {
        System.out.println("在oracle登录...");
    }
}
