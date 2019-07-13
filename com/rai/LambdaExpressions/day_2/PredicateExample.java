/**
 * 
 */
package Java8.com.rai.LambdaExpressions.day_2;

import java.util.ArrayList;
import java.util.Arrays;
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
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> even = filter(list, (Integer i)-> i%2 == 0);
		System.out.println(even.toString());
		List<Integer> odd = filter(list, (Integer i)-> i%2 != 0);
		System.out.println(odd.toString());
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> t) {
		List<T> result = new ArrayList<>();
		for(T item:list) {
			if(t.test(item))result.add(item);
		}
		return result;
	}

}
