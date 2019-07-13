/**
 * 
 */
package Java8.com.rai.LambdaExpressions.day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Akansh_Rai create a method map to transform a list of Strings into a
 *         list of Integers containing the length of each String.
 *
 */
public class FunctionEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Akansh", "Amar", "Ashutosh", "Amardeep");
		list.forEach((String item) -> System.out.print(" " + item));
		List<Integer> result = map(list, (String str) -> str.length());
		System.out.println("");
		result.forEach((Integer item) -> System.out.print(" " + item));

	}

	public static <T, R> List<R> map(List<T> list, Function<T, R> func) {
		List<R> result = new ArrayList<>();
		for (T item : list) {
			result.add(func.apply(item));
		}
		return result;
	}

}
