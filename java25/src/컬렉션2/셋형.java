package 컬렉션2;

import java.util.HashSet;

public class 셋형 {
	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("휴대폰");
		bag.add("휴대폰");
		System.out.println(bag.size());
		System.out.println(bag);
		bag.remove("휴지");
		System.out.println(bag);
	}
}
