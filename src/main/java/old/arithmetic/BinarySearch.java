package old.arithmetic;

/**
 * @author xiey
 * @version 2020/4/23
 * @description: 二分查找
 */
public class BinarySearch {

    private static int[] array = {1, 3, 5, 7, 9, 10, 17};

    public static void main(String[] args) {
        Boolean aBoolean = binarySearch(5, 0, array.length - 1);
        System.err.println("exist？" + aBoolean);
        int i = binarySortRecursion(5, 0, array.length - 1);
        System.err.println(i);
    }

    /**
     * @param flag 要查找的值
     * @return 是否存在
     */
    public static Boolean binarySearch(int flag, int indexOfStart, int indexOfEnd) {
        int midIndex = (indexOfStart + indexOfEnd) / 2;

        if (flag < array[indexOfStart] || flag > array[indexOfEnd] || indexOfStart > indexOfEnd) {
            return false;
        }
        if (flag < array[midIndex]) {
            return binarySearch(flag, indexOfStart, midIndex - 1);
        } else if (flag > array[midIndex]) {
            return binarySearch(flag, midIndex + 1, indexOfEnd);
        } else {
            return true;
        }
    }

    public static int binarySortRecursion(int key, int low, int high) {
        if (low <= high) {
            int mid = (low + high) >>> 1;
            if (key < array[mid]) {
                return binarySortRecursion(key, low, mid - 1);
            } else if (key > array[mid]) {
                return binarySortRecursion(key, mid + 1, high);
            } else {
                return mid;
            }
        }
        return -1;
    }
}
