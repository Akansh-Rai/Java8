/**
 * 
 */
package Java8.com.rai.LambdaExpressions.day_2;

import java.util.Arrays;
import java.util.List;

/**
 * @author Akansh_Rai
 *
 */
public class ConsumerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.forEach((Integer iten) -> System.out.print(" " + iten));
		list.forEach((Integer iten) -> System.out.println(" " + iten * 2));
		System.out.println(" ");
		list.forEach((Integer item) -> {
			System.out.print(item);
			System.out.println(" * 2 = " + item * 2);
		});
	}

}
