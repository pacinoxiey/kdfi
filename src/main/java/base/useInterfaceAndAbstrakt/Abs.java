package base.useInterfaceAndAbstrakt;

/**
 * @author xiey
 * @version 2019年4月2日 上午10:38:14
 * @describe
 */
public abstract class Abs {
	// 抽象类可以拥有私有方法,属性, 并且 public ,protected，private
	public String ss = "";

	public void method() {
	}

	protected String t() {
		return null;
	}

	// 抽象方法只能是public或者protected的
	public abstract int a();
}
