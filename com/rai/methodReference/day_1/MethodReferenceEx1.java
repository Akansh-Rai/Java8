/**
 * 
 */
package Java8.com.rai.methodReference.day_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Java8.com.rai.methodAsParameter.day1.Apple;

/**
 * @author Akansh_Rai
 *
 */
public class MethodReferenceEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("green", 145), new Apple("red", 165), new Apple("green", 155),
				new Apple("red", 125));
		//System.out.println(apples.toString());
		apples.forEach(apple->System.out.println(apple));
		
		/**
		 * Java 8 simple lambda.
		 */
		Collections.sort(apples, (a1,a2)->a1.getWeight()-a2.getWeight());
		System.out.println("\n*** After sorting by weight *** ");
		apples.forEach(apple->System.out.println(apple));
		
		/********************/
		apples = Arrays.asList(new Apple("green", 145), new Apple("red", 165), new Apple("green", 155),
				new Apple("red", 115));
		
		// method reference
		System.out.println("\n*** After sorting by weight *** ");
		apples.sort(java.util.Comparator.comparing(Apple::getWeight));
		apples.forEach(System.out::println);
		
	}
}
