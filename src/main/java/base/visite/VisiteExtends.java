package base.visite;

/**
 * @author xiey
 * @version 2019年4月2日 上午11:10:38
 * @describe
 */
public class VisiteExtends extends Visite {

	private void test() {
		super.name();
		this.name();
	}
	
	protected void name() {
		System.err.println("VisiteExtends protected");
	}
}
