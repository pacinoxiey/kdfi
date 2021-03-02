package old.design.code.factorydesign.factory;

import old.design.code.factorydesign.behavior.*;

/**
 * @author xiey
 * @date 2019/7/12 11:06
 * @description：
 */
public class EasyFactory {

    private static final String MYSQL = "MySQL";
    private static final String ORACLE = "Oracle";
    private static String db = MYSQL;

    public static IUser createUser() {

        IUser user = null;
        switch (db) {
            case "MySQL":
                user = new MysqlUser();
                break;

            case "Oracle":
                user = new OracleUser();
                break;
        }
        return user;
    }

    public static ILogin createLogin() {

        ILogin login = null;
        switch (db) {
            case "MySQL":
                login = new MysqlLogin();
                break;

            case "Oracle":
                login = new OracleLogin();
                break;
        }
        return login;
    }
}
