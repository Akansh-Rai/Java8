/**
 * 
 */
package Java8.com.rai.methodAsParameter.day1;

/**
 * @author Akansh_Rai
 *
 */
public class GreenApple implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return "green".equalsIgnoreCase(apple.getColor());
	}

}
