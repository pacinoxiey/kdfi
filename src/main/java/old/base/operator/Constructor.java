package old.base.operator;

/**
 * 构造器
 * @author 10040
 *
 */
public class Constructor {
	static String stri="aa";
	
	public Constructor() {
		// TODO Auto-generated constructor stub
		System.out.println("构造函数");
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
