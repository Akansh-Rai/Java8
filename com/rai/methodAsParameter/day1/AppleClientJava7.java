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
public class AppleClientJava7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple("green", 140));
		apples.add(new Apple("red", 140));
		apples.add(new Apple("green", 150));
		
		List<Apple> greenApples = filterApple(apples,new GreenApple());
		System.out.println(greenApples.toString());
		
		List<Apple> heavyApples = filterApple(apples,new HeavyApple());
		System.out.println(heavyApples.toString());
	}

	private static List<Apple> filterApple(List<Apple> apples, ApplePredicate greenApple) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : apples) {
			if(greenApple.test(apple)) result.add(apple);
		}
		return result;
	}

}
