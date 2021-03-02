package old.base.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiey
 * @version 2020/4/17
 * @description:
 */
public class ReflectClass {
    private final static String TAG = "peter.log.ReflectClass";

    // 创建对象
    public static void reflectNewInstance() {
        try {
            Class<?> classBook = Class.forName("old.base.reflection.Book");
            Method[] methods = classBook.getMethods();
            System.out.println("打印对象的方法：");
            for (Method method : methods) {
                System.out.println("方法名称：" + method.getName());
                System.out.println("方法返回值类型：" + method.getReturnType());
                System.out.println("方法入参：" + method.getParameterTypes());
            }
            //查找类所在位置，并将找到的Java类的字节码装入内存，生成对应的Class对象
            ClassLoader classLoader = classBook.getClassLoader();
            Object objectBook = classBook.newInstance();
            Book book = (Book) objectBook;
            book.setName("java 高级特性 反射");
            book.setAuthor("***");
            System.out.println(TAG + " reflectNewInstance book = " + book.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 反射私有的构造方法
    public static void reflectPrivateConstructor() {
        try {
            Class<?> classBook = Class.forName("old.base.reflection.Book");
            Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor
                    (String.class, String.class);
            declaredConstructorBook.setAccessible(true);//关闭java 访问权限控制
            Object objectBook = declaredConstructorBook.newInstance("java 高级特性 反射", "***");
            Book book = (Book) objectBook;
            System.out.println(TAG + " reflectPrivateConstructor book = " + book.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 反射私有属性
    public static void reflectPrivateField() {
        try {
            Class<?> classBook = Class.forName("old.base.reflection.Book");
            Object objectBook = classBook.newInstance();
            Field fieldTag = classBook.getDeclaredField("TAG");
            fieldTag.setAccessible(true);
            String tag = (String) fieldTag.get(objectBook);
            System.out.println(TAG + " reflectPrivateField tag = " + tag);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 反射私有方法
    public static void reflectPrivateMethod() {
        try {
            Class<?> classBook = Class.forName("old.base.reflection.Book");
            Method methodBook = classBook.getDeclaredMethod("declaredMethod", int.class);
            methodBook.setAccessible(true);
            Object objectBook = classBook.newInstance();
            String string = (String) methodBook.invoke(objectBook, 0);

            System.out.println(TAG + " reflectPrivateMethod string = " + string);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        reflectPrivateConstructor();
//        reflectNewInstance();
    }

    public static int ss[] = {1, 2, 3, 4, 5, 6, 7, 8};

    public List<List<Integer>> getList() {
        List<List<Integer>> example = new ArrayList<>();
        for (int a : ss) {
            int A = 15 - a;
            for (int b : ss) {
                if (b == a) {
                    continue;
                }
                int B = A - b;
                for (int c : ss) {
                    if (c == a || c == b) {
                        continue;
                    }
                    if (c == B) {
                        example.add(Arrays.asList(a, b, c));
                    }
                }
            }
        }
        return example;
    }

    public static List<List<List<Integer>>> kk(List<List<Integer>> example) {

        List<List<List<Integer>>> result = new ArrayList<>();
        int l = 0;
        for (List<Integer> arr : example) {
            List<Integer> exist = new ArrayList<>();//重复出现的数字

            List<Integer> numbers = new ArrayList<>();//全部数字
            numbers.addAll(arr);
            List<List<Integer>> arrList = new ArrayList<>();//结果集
            arrList.add(arr);
            System.out.println("第" + l + "次循环");
            l++;

            for (List<Integer> arr2 : example) {
                if (arrList.contains(arr2)) {
                    continue;
                }
                Boolean flag = false;
                for (Integer integer : arr2) {
                    if (numbers.contains(integer)) {
                        if (exist.contains(integer)) {
                            flag = true;
                            break;
                        }
                        exist.add(integer);
                    }
                }
                if (flag) {
                    continue;
                }
                arrList.add(arr2);
                if (exist.size() > 4) {
                    break;
                }
                numbers.addAll(arr2);
                if (arrList.size() == 4) {
                    List<List<Integer>> resultItem = new ArrayList<>(arrList);
                    result.add(resultItem);
                    break;
                }
            }
        }
        return result;
    }

}
