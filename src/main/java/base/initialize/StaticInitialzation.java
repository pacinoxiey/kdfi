package base.initialize;


/**
 * 测试类
 * @author 10040
 *
 */
public class StaticInitialzation {
	public static void main(String[] args) {
		System.out.println("creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
	}
	
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}
