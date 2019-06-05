package hunis.nsyw.class4;


import java.util.Stack;

/**
 * @author xiey
 * @date 2019/1/11 16:23
 * @description：
 */
public class Class4 {

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree();
        Integer tar = null;
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100);
            if (i == 5) {
                tar = num;
            }
            tree.insert(num);
        }

        boolean contains = tree.contains(tar);
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.pop();
//        tree.midOrder(tree.root);
        tree.midOrderWithoutRecurs();
        System.err.println();
    }
}
