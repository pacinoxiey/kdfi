package base.thread;

/**
 * @author xiey
 * @version 2019年4月2日 下午1:57:07
 * @describe
 */
public class RunThreadByExtends extends Thread {
	private int count = 10;

	public void run() {
		while (true) {
			System.out.println(count + "");
			if (--count == 0) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		new RunThreadByExtends().start();

	}
}
