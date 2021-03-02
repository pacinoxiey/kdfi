package old.base.thinkinginjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 10040 xiey
 * @create 2018/11/6 14:18
 */

public class Test {
    public static void main(String[] args) {
        List<String> ss = new ArrayList<>();
        ss.add("a");
        ss.add("b");
        ss.add("c");
        ss.add("d");
        ss.add("e");
//        ss.add("f");
        Set<String> clcCodes = new HashSet<>(ss);
        boolean remove = clcCodes.remove("");
        boolean remove1 = clcCodes.remove(null);
        int sum = clcCodes.size() / 3;
        int m = clcCodes.size() % 3;
        if (m != 0) {
            sum += 1;
        }
        List<String> list = new ArrayList<>(clcCodes);
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < sum; i++) {
            if (i == sum - 1) {
                if (m == 0) {
                    result.add(list.subList(i * 3, (i + 1) * 3));
                } else {
                    result.add(list.subList(i * 3, i * 3 + m));
                }
            } else {
                result.add(list.subList(i * 3, (i + 1) * 3));
            }
        }

        System.err.println("");

    }
}
