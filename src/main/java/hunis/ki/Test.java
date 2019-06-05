package hunis.ki;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author xiey
 * @version 2017年11月21日 下午6:19:14
 * @describe
 */
public class Test {
    public static void main(String[] args) {
        String s = new String("a");
        System.out.println(s.hashCode());
        String a = new String("a");
        System.out.println(a.hashCode());
        System.out.println(s == "a");
        Object object = new Object();
        Integer i = new Integer(1);
        System.out.println(i.toString());
        System.err.println(Timestamp.valueOf(LocalDateTime.now()));
    }
}
