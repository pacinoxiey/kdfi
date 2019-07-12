package keyword.abstractAndInterface;

/**
 * @author xiey
 * @date 2019/7/12 15:28
 * @description：
 */
public interface InterfaceClass {

    //接口不允许存在构造方法, 所有方法都是抽象接口, 不能拥有方法体
//    InterfaceClass();

    //接口中可以存在静态变量, 但默认是public final的
    public static final String a = "";

    //方法默认是public, 且只能是public
    public void method();
}
