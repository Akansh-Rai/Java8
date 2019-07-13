/**
 * 
 */
package Java8.com.rai.methodAsParameter.day1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akansh_Rai
 *
 */
public class AnonymousClassJava7 {

	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple("green", 140));
		apples.add(new Apple("red", 140));
		apples.add(new Apple("green", 150));

		List<Apple> greenApples = filterApple(apples, new ApplePredicate() {
			@Override
			public boolean test(Apple apple) {
				return "green".equalsIgnoreCase(apple.getColor());
			}
		});

		System.out.println(greenApples.toString());

		List<Apple> heavyApples = filterApple(apples, new ApplePredicate() {

			@Override
			public boolean test(Apple apple) {
				return apple.getWeight() > 145;
			}
		});
		System.out.println(heavyApples.toString());
	}

	private static List<Apple> filterApple(List<Apple> apples, ApplePredicate applePredicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : apples) {
			if (applePredicate.test(apple))
				result.add(apple);
		}
		return result;
	}

}
