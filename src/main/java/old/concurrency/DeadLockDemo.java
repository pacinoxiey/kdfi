package old.concurrency;

public class DeadLockDemo {
    private static final String A = "A";
    private static final String B = "B";

    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }

    private void deadLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    System.out.println("a");
                    try {
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("1");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    System.out.println("b");
                    synchronized (A) {
                        System.out.println("2");
                    }
                }
            }
        });
        t1.start();
        try {
            t1.join();//强制当前线程执行结束再执行主线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
