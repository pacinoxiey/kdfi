package base.abstractAndInterface;

/**
 * @author xiey
 * @date 2019/7/12 15:27
 * @description：
 */
public abstract class AbstractClass {


    /**
     * 可以拥有构造函数
     */
    public AbstractClass(String ss) {
        c = ss;
    }

    public AbstractClass() {

    }

    /**
     * 1.抽象类的静态变量访问权限可以是任意的
     * 2.可以存在属性
     */
    public static final String a = "ss";
    public final String b = "ss";
    private static String c = "ss";

    /**
     * 可以拥有普通方法
     */
    public void method() {

    }

    public abstract void method2();
}
