/**
 * 
 */
package Java8.com.rai.methodReference.day_1;

import java.util.Arrays;
import java.util.List;

/**
 * @author Akansh_Rai
 *
 */
public class MethodReferenceEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("akansh","rai","Ashish","Singh");
		System.out.println(" ******* List ************\n" + list.toString());
		list.sort((s1,s2)->s1.compareTo(s2));
		System.out.println(" ******* Sorted List ************\n" + list.toString());
	}	

}
