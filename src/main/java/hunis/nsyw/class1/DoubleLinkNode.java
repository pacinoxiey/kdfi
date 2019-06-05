package hunis.nsyw.class1;

/**
 * @author xiey
 * @date 2019/1/10 14:28
 * @description：
 */
public class DoubleLinkNode {

    public int data;
    public DoubleLinkNode next;
    public DoubleLinkNode prev;

    public DoubleLinkNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
