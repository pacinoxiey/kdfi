package design.factory;

/**
* @author xiey
* @version 2017年10月30日 上午11:16:22
* @describe
*/
public class Test {
	public static void main(String[] args) {
		Device device = new KeyBoard();
		device.setModel(1);
		device.setSize(2);
	}
}
