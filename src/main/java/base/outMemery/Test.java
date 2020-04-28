package base.outMemery;

import java.util.Vector;

/**
 * @author xiey
 * @version 2020/4/24
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        Vector v = new Vector(10);
        for (int i = 1; i < 100; i++) {
            Object o = new Object();
            v.add(o);
            o = null;
        }

        String a = "abc";
        StringBuffer sb = new StringBuffer("abc");
        System.err.println(a.equals(sb));
    }
}
