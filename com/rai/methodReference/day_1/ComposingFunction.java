/**
 * 
 */
package Java8.com.rai.methodReference.day_1;

import java.util.function.Function;

/**
 * @author Akansh_Rai
 *
 */
public class ComposingFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Function<Integer, Integer> f = x -> x + 1;
		Function<Integer, Integer> g = x -> x * 2;
		Function<Integer, Integer> h = f.andThen(g);
		System.out.println(h.apply(1));
		
		h = f.compose(g);
		System.out.println(h.apply(1));
	}

}
