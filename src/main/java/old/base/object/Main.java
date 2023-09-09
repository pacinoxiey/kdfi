package old.base.object;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","b");
        map.remove("a");
        System.out.println(map);
    }
}
