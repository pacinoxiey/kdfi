package A20210224.exam;

/**
 * @author xiey
 * @version 2021/3/8 18:25
 * @desc:
 */
public class MyThread implements Runnable {

    private String name;

    private int times;


    public MyThread(String name, int times) {
        this.name = name;
        this.times = times;
    }

    @Override
    public void run() {
        synchronized (Main2.output) {
            Main2.output = new StringBuilder();
            System.out.println("刷新字符串:" + Main2.output.toString());
            for (int i = 0; i < times; i++) {
                Main2.output.append(name);
            }
        }
    }
}
