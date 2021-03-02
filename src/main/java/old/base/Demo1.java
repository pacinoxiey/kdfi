package old.base;

import old.base.visite.Visite;
import old.base.visite.VisiteExtends;

public class Demo1 {
	public static void main(String[] args) {
		int p = 33;
		p = p>>1;
		System.err.println(p);
		String a = "abcd";
		String s = "ab" + new String("cd");
		System.out.println(a == s);
		int i = 0, b = 1;
		add(i, b);
		System.out.println(i);

		//
		Visite v = new Visite();
//		v.name();
//		v.defaultt();
		VisiteExtends ve = new VisiteExtends();
//		ve.defaultt();
	}

	static void add(int i, int b) {
		i = i + b;
	}
}