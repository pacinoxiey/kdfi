package base.thinkinginjava;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author 10040 xiey
 * @create 2018/11/29 11:40
 */

public class Test3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");
        ListIterator<String> listIterator = list.listIterator(1);
        Integer s = null;
        System.err.println(s);
        System.err.println(10>>3);
    }
}
