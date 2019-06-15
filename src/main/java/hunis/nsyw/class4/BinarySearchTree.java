package hunis.nsyw.class4;


import java.util.Stack;

/**
 * @author xiey
 * @date 2019/1/11 16:23
 * @description：二叉树
 */
public class BinarySearchTree<T extends Comparable<T>> {

    public Node root;

    /**
     * @param data
     * @return
     */
    public boolean insert(T data) {
        if (root == null) {
            root = new Node(data);
            return true;
        }

        Node cur = root;
        while (true) {
            //比该节点小的和相等的在左边
            if (data.compareTo((T) cur.data) < 0) {
                if (cur.left == null) {
                    cur.left = new Node(data);
                    break;
                } else {
                    cur = cur.left;
                }
            } else {
                if (cur.right == null) {
                    cur.right = new Node(data);
                    break;
                } else {
                    cur = cur.right;
                }
            }
        }
        return true;
    }

    public boolean contains(T t) {

        if (t == null) {
            return false;
        }

        Node current = root;
        while (true) {
            if (current == null) {
                return false;
            }
            if (t.compareTo((T) current.data) == 0) {
                return true;
            } else if (t.compareTo((T) current.data) < 0) {
                //沿左边节点查找
                current = current.left;
            } else {
                current = current.right;
            }
        }
    }

    public void preOrder(Node n) {
        System.out.println(n.data);

        if (n.left != null) {
            preOrder(n.left);
        }
        if (n.right != null) {
            preOrder(n.right);
        }
    }

    public void midOrder(Node n) {
        System.err.println(n.data);
        if (n.left != null) {
            midOrder(n.left);
        }
        if (n.right != null) {
            midOrder(n.right);
        }
    }

    //非递归遍历
    public void midOrderWithoutRecurs() {
        if (root == null) {
            return;
        }
        Stack<Node> s = new Stack<>();
        Node current;

        s.push(root);

        while (!s.isEmpty()) {
            current = s.get(s.size() - 1);//获取栈顶元素
            /**
             *  0未遍历,  检查左节点压入栈中
             *  1输出当前节点
             *  2检查右节点压入栈中
             *  3弹出
             */
            if (current.state == 0) {
                if (current.left != null) {
                    s.push(current.left);
                }
                current.state = 1;
            } else if (current.state == 1) {
                System.out.println(current.data);
                current.state = 2;
            } else if (current.state == 2) {
                if (current.right != null) {
                    s.push(current.right);
                }
                current.state = 3;
            } else if (current.state == 3) {
                s.pop();
                current.state = 0;
            }
        }
    }
}
