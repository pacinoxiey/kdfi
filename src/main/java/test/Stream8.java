package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author xiey
 * @version 2020/4/26
 * @description:
 */
public class Stream8 {


    public static void main(String[] args) {
        List<B> bList = new ArrayList<>();
        bList.add(new B("a", "1"));
        bList.add(new B("a", "2"));
        bList.add(new B("b", "1"));
        Map<String, List<String>> collect = bList.stream().collect(Collectors.toMap(B::getBb, i -> {
            List<String> list = new ArrayList<>();
            list.add(i.getCc());
            return list;
        }, (List<String> value1, List<String> value2) -> {
            value1.addAll(value2);
            return value1;
        }));
        System.err.println();
    }
}
