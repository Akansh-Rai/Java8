/**
 * 
 */
package Java8.com.raimethodAsParameter.day_2;

import java.util.ArrayList;
import java.util.List;

import Java8.com.rai.methodAsParameter.day1.Apple;

/**
 * @author Akansh_Rai
 *
 */
public class SortingInJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple("green", 150));
		apples.add(new Apple("green", 140));
		apples.add(new Apple("red", 145));
		apples.add(new Apple("green", 120));

		apples.sort((Apple apple1, Apple apple2) -> apple1.getWeight() - apple2.getWeight());
		System.out.println(apples.toString());
	}

}
