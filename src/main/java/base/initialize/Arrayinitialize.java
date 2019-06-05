package base.initialize;

import java.util.Random;

/**
 * 数组
 * @author 10040
 *
 */
public class Arrayinitialize {
	public static void main(String[] args) {
		Random random = new Random(47);
		Integer[] integer = new Integer[random.nextInt(40)];
		System.out.println(integer.length);
		for (int i = 0; i < 20; i++) {
			System.out.println(random.nextInt(10));
		}
		
	}
}
