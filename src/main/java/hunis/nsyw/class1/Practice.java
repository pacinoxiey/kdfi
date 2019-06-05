package hunis.nsyw.class1;

/**
 * @author xiey
 * @date 2019/1/10 14:26
 * @description：
 */
public class Practice {

    static class DoubleLinkList {
        public DoubleLinkNode head;
        public DoubleLinkNode tail;

        // 查询第 index 项的内容
        public DoubleLinkNode queryNode(int index) {
            DoubleLinkNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }

            return cur;
        }

        // 将 toBeDelete 从链表中删除
        public void deleteNode(DoubleLinkNode toBeDelete) {
            DoubleLinkNode cur = head;
            while (cur != null) {
                if (cur == toBeDelete) {
                    DoubleLinkNode prev = cur.prev;
                    DoubleLinkNode next = cur.next;
                    prev.next = next;
                    prev.prev = prev;
                    return;
                }
                cur = cur.next;
            }
        }

        // 将toBeInsert插入到pos结点后面
        public void insertNode(DoubleLinkNode pos, DoubleLinkNode toBeInsert) {
            toBeInsert.next = pos.next;
            toBeInsert.prev = pos;

            pos.next.prev = toBeInsert;
            pos.next = toBeInsert;

        }

        public DoubleLinkList(DoubleLinkNode doubleLinkNode) {
            this.head = doubleLinkNode;
        }
    }

    public static void main(String[] args) {

        DoubleLinkNode head = new DoubleLinkNode(1);

        DoubleLinkNode two = new DoubleLinkNode(2);
        head.next = two;
        two.prev = head;


        DoubleLinkNode three = new DoubleLinkNode(3);
        three.prev = two;
        two.next = three;


        DoubleLinkNode four = new DoubleLinkNode(4);
        four.prev = three;
        three.next = four;

        DoubleLinkNode toBeInsert = new DoubleLinkNode(00);

        DoubleLinkList list = new DoubleLinkList(head);

        DoubleLinkNode doubleLinkNode = list.queryNode(1);
        list.deleteNode(four);
        list.insertNode(two, toBeInsert);
        System.err.println("");
    }
}
