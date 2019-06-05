package base.initialize;

/**
 * @author xiey
 * @version 2017年10月3日 下午7:44:54
 * @describe
 */
public class House {

	Window w1 = new Window(1);

	House() {// 属性会首先加载, 因此 构造函数可以使用成员变量
		System.out.println("House()");
		w3 = new Window(33);
	}

	Window w2 = new Window(2);

	void f() {
		System.out.print("f()");
	}

	Window w3 = new Window(3);

}
