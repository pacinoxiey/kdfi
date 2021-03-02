package old.base.thinkinginjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10040 xiey
 * @create 2018/11/6 14:18
 */

public class Test1 {
    public static void main(String[] args) {

        Uhd uhd = new Uhd();
        List<String> ss = new ArrayList<>();
        ss.add("a");
        ss.add("");
        uhd.setFactory(ss);
        ss = new ArrayList<>();
        ss.add("b");
        ss.add("");
        uhd.setSupply(ss);

        List<String> test = null;
        if (uhd.getFactory() != null) {
            test = new ArrayList<>();
            for (String code : uhd.getFactory()) {
                if (code != "") {
                    test.add(code);
                }
            }
            uhd.setFactory(test);
        }

        if (uhd.getSupply() != null) {
            test = new ArrayList<>();
            for (String code : uhd.getSupply()) {
                if (code != "") {
                    test.add(code);
                }
            }
            uhd.setSupply(test);
        }
        System.err.println("");
    }
}
