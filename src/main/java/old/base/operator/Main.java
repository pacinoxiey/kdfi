package old.base.operator;
/**
 * main
 * @author 10040
 *
 */
public class Main {
	public static void main(String[] args) {
		Constructor constructor = new Constructor();
//		new Main();
		Main ss = new Main();
//		System.out.println(Constructor.stri);
	}
	
	public void finalize(){
		System.out.println("调用。。。");
	}
}
