package old.base.objectisall;

/**
 * @author 10040
 */
public class Practice {
	public static int i;
	public static char ch;
	public static byte bt;
	public static double db;
	public static float ft;
	
	public static void main(String[] args) {
		System.out.println();
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
}
