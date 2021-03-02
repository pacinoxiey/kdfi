package A20210224.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xiey
 * @version 2021/2/24 14:35
 * @desc:
 */
public class A {
    public static void main(String[] args) {

//        try {
//            test1();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        test3();
//        test4();
//        test5();
//        test6();
        System.err.println(test7(2));

    }

    private static void test1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();

        list.add(12);
//这里直接添加会报错
//        list.add("a");
        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);
//但是通过反射添加，是可以的
        add.invoke(list, "kl");

        System.out.println(list);

    }

    private static void test3() {
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);

        System.out.println("i1=i2   " + (i1 == i2)); // true
        System.out.println("i1=i2+i3   " + (i1 == i2 + i3)); //true
        System.out.println("i1=i4   " + (i1 == i4)); //false
        System.out.println("i4=i5   " + (i4 == i5)); //false
        System.out.println("i4=i5+i6   " + (i4 == i5 + i6)); //true
        System.out.println("40=i5+i6   " + (40 == i5 + i6)); //true

    }

    private static void test4() {
        int num1 = 10;
        int num2 = 20;

        swap(num1, num2);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


    private static void test5() {

        Student s1 = new Student("小张");
        Student s2 = new Student("小李");
        swap(s1, s2);
        System.out.println("s1:" + s1.getName()); //小张
        System.out.println("s2:" + s2.getName()); //小李

    }

    //传入的只是引用的拷贝, 不影响s1跟s2
    private static void swap(Student x, Student y) {
        Student temp = x;// temp reference s1
        x = y;//x reference s2
        y = temp;//y reference s1
        y.setName("a");
        System.out.println("x:" + x.getName()); //小李
        System.out.println("y:" + y.getName()); //小张
    }

    private static void test6() {
        new Stu2("13");
    }

    private static int test7(int value) {
        try {
            System.out.println("==");
            return value * value;
        } finally {
            if (value == 2) {
                return 0;// finally会在return之前执行, 或者叫覆盖
            }
        }
    }

    private static void tst8(){
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }
}
