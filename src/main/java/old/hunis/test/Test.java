package old.hunis.test;

/**
 * @author xiey
 * @version 2019年4月8日 下午2:22:47
 * @describe
 */
public class Test {

    public static void main(String[] args) {
//		Integer s = -1;
//		System.err.println(s);
//		System.err.println(1000L-2000L);
//		System.out.println("结果是：" + Test.foo(6));
    }

    /**
     * 递归算法实现
     */
    public static int foo(int i) {
        if (i <= 0)
            return 0;
        else if (i > 0 && i <= 2)
            return 1;
        return foo(i - 1) + foo(i - 2);
    }

}
