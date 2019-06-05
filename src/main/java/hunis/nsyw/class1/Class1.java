package hunis.nsyw.class1;

/**
 * @author xiey
 * @date 2019/1/8 16:22
 * @description：链表
 */
public class Class1 {

    public static void main(String[] args) {
//        pra();
//        sort();
//        dos();


    }

    private static void pra() {
        int[] array = new int[10];
        System.err.println(array.length);
        //1,2,3,4,5,6,7,8,9,10
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
        //1,2,3,10,4,5,6,7,8,9
        for (int i = array.length - 1; i > 3; i--) {
            array[i] = array[i - 1];
        }
        array[3] = 10;
        for (int a : array) {
            System.out.print(a + ",");
        }
    }

    //1000,999,998...
    private static void sort() {
        int[] array = {3, 4, 21, 5, 2, 1, 6};
        for (int i = 0; i < array.length - 1; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    int a = array[i];
                    array[i] = array[k];
                    array[k] = a;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + ",");
        }
    }
    //查询列表中的第n项

    /**
     * @param head  链表
     * @param index n
     * @return
     */
    private static int queryData(LinkNode head, int index) {
        LinkNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;//每次向后遍历, 将cur置为当前项,直到第n
        }

        return cur.data;
    }

    private static void dos() {
        LinkNode head = new LinkNode(1);
        head.next = new LinkNode(2);

        //从链表中间插入
        LinkNode middle = new LinkNode(3);
        middle.next = head.next;
        head.next = middle;

        //从链表中删除中间一项
        head.next = head.next.next;
    }
}














