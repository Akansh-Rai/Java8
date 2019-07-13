package Java8.com.rai.methodReference.day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ChainingUsingAndEx {
	public static void main(String[] args) {
		List<MyApple> apples = Arrays.asList(new MyApple("India", "red", 150), new MyApple("India", "green", 140),
				new MyApple("UK", "green", 130), new MyApple("USA", "red", 145), new MyApple("India", "red", 130),
				new MyApple("India", "red", 160));
		System.out.println("\n ************ Apple *************" + apples.toString());

		Predicate<MyApple> redApple = (a -> a.getColor().endsWith("red"));

		Predicate<MyApple> redHeivyOrRedApple = redApple.and(a -> a.getWeight() > 145)
				.or(a -> a.getColor().equalsIgnoreCase("green"));
		List<MyApple> specialApple = filter(apples, redHeivyOrRedApple);
		System.out.println("\n ************ special Apple *************" + specialApple.toString());
		System.out.println();
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			if (predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
}
