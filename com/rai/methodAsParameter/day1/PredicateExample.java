/**
 * 
 */
package Java8.com.rai.methodAsParameter.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Akansh_Rai
 *
 */
public class PredicateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple("green", 140));
		apples.add(new Apple("red", 140));
		apples.add(new Apple("green", 150));

		List<Apple> greenApples = genericFilter(apples, (Apple apple) -> "green".equalsIgnoreCase(apple.getColor()));
		System.out.println(greenApples.toString());
	}

	public static <T> List<T> genericFilter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T item : list) {
			if (predicate.test(item))
				result.add(item);
		}
		return result;
	}

}
