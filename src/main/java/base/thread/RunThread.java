package base.thread;

public class RunThread implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"===="+i);
		}
	}
}
