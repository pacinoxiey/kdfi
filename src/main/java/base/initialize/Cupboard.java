package base.initialize;
/**
 * @author 10040
 */
public class Cupboard {
	Bowl bowl3 = new Bowl(3);		//非静态域可以多次
	static Bowl bowl4 = new Bowl(4);	//静态域，只加载一次
	public Cupboard() {
		// TODO Auto-generated constructor stub
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	
	void f3(int marker){
		System.out.println("f3("+marker+")");
	}
	static Bowl bowl5 = new Bowl(5);
}
