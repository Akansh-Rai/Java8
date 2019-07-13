/**
 * 
 */
package Java8.com.rai.methodAsParameter.day1;

/**
 * @author Akansh_Rai
 *
 */
public class HeavyApple implements ApplePredicate {

	/* (non-Javadoc)
	 * @see com.rai.java8.methodAsParameter.day1.ApplePredicate#test(com.rai.java8.methodAsParameter.day1.Apple)
	 */
	@Override
	public boolean test(Apple apple) {
		return 150 >= apple.getWeight();
	}

}
