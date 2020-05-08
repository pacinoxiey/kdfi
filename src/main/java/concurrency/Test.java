package concurrency;

public class Test {
    public static void main(String[] args) {
        DoSomething d = new DoSomething();
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    d.syncStatic(4000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    d.sync1(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    d.sync2(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                d.asyn();
            }
        });
        //synchronized方法将锁定class对象，所有同步方法都要等待锁，普通方法不受影响
        t3.start();
        t1.start();
        t2.start();
        t4.start();
    }
}
