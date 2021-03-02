package old.base.thinkinginjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10040 xiey
 * @create 2018/11/6 14:18
 */

public class Test2 {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();
        Entity entity = new Entity("a");
        Entity entity2 = new Entity("b");
        entities.add(entity);
        entities.add(entity2);

        List<Entity> all = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<Entity> list = new ArrayList<>(entities);
            for (Entity entity1 : list) {
                entity1.setName(entity1.getName() + i);
            }
            all.addAll(list);
        }
        System.err.println("");
    }
}
