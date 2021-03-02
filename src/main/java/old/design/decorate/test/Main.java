package old.design.decorate.test;

/**
 * @author xiey
 * @version 2020/4/14
 */
public class Main {

    public static void main(String[] args) {
        Base base = new TypeA();
        System.err.println(base.getDescirption());

        Base base2 = new TypeA();
        Test1 base3 = new Test1(base2);
        System.err.println(base3.getDescirption());
    }
}
