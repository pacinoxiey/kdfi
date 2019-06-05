package hunis.nsyw.class4;

/**
 * @author xiey
 * @date 2019/1/11 16:25
 * @description：
 */
public class Node {

    public Object data;
    public Node left;
    public Node right;
    public int state;

    public Node(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
