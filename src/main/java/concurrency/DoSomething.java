package concurrency;

/**
 * @author xiey
 * @version 2020/4/23
 * @description:
 */
public class DoSomething {

    public synchronized void sync1(Long millis) throws InterruptedException {
        System.out.println("进入锁定方法sync1。。。。");
        System.out.println("延迟" + millis + "毫秒");
        Thread.sleep(millis);
        System.out.println("方法sync1结束。。。。");
    }

    public synchronized void sync2(Long millis) throws InterruptedException {
        System.out.println("进入锁定方法sync2，延迟" + millis + "秒。。。。");
        Thread.sleep(millis);
        System.out.println("方法sync2结束。。。。");
    }

    public synchronized void syncStatic(Long millis) throws InterruptedException {
        System.out.println("进入锁定方法syncStatic。。。。");
        System.out.println("延迟" + millis + "毫秒");
        Thread.sleep(millis);
        System.out.println("方法syncStatic结束。。。。");
    }

    public void asyn() {
        System.err.println("普通方法");
    }
}
