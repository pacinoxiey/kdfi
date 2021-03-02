package old.base.thread;

/**
 * @author xiey
 * @version 2019年4月2日 下午2:35:43
 * @describe
 */
public class DieLock extends Thread {
	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		String d = null ;
		d.hashCode();
//		if (flag) {
//			synchronized (MyLock.objA) {
//				System.out.println("if objA");
//				synchronized (MyLock.objB) {
//					System.out.println("if objB");
//				}
//			}
//		} else {
//			synchronized (MyLock.objB) {
//				System.out.println("else objB");
//				synchronized (MyLock.objA) {
//					System.out.println("else objA");
//				}
//			}
//		}
	}
}
