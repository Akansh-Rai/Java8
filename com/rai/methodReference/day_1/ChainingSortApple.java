/**
 * 
 */
package Java8.com.rai.methodReference.day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Akansh_Rai
 *
 */
public class ChainingSortApple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<MyApple> apples = Arrays.asList(new MyApple("India", "red", 150), new MyApple("India", "green", 140),
				new MyApple("UK", "green", 130), new MyApple("USA", "red", 145), new MyApple("India", "red", 130),
				new MyApple("India", "red", 160));
		System.out.println("\n ************ Apple *************" + apples.toString());
		
		Predicate<MyApple> redApple = (a -> a.getColor().endsWith("red"));
		List<MyApple> redAppleList = filter(apples, redApple);
		System.out.println("\n ************ Red Apple *************" + redAppleList.toString());
		
		List<MyApple> notRedApple = filter(apples, redApple.negate());
		System.out.println("\n ************ Not Red Apple *************" + notRedApple.toString());
	}
	
	public static <T> List<T> filter (List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();		
		for(T t : list) {
			if(predicate.test(t)) {
				result.add(t);
			}
		}		
		return result;
	}

}
