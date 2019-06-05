package base.visite;

/**
 * @author xiey
 * @version 2019年4月2日 上午11:01:20
 * @describe 访问修饰符
 */
public class Visite {

	protected void name() {
		System.err.println("protected");
	}

	// 只有包访问权限 default, 子类同
	String defaultt() {
		return "default";
	}
}
