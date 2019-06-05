package hunis.nsyw.class5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author xiey
 * @date 2019/1/15 15:00
 * @description：
 */
public class Class5 {

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ll.add(i);
            ll.addLast(i);
            ll.addFirst(i);
            al.add(i);
        }

        Iterator<Integer> ii = ll.iterator();
        Iterator<Integer> ai = al.iterator();
        while (ii.hasNext()) {
            System.out.println(ii.next());
        }

        while (ai.hasNext()) {
            System.out.println(ai.next());
        }
    }
}
