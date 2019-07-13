/**
 * 
 */
package Java8.com.rai.closure.day1;

import java.util.function.Consumer;

/**
 * @author Akansh_Rai
 *
 */
public class ClosureExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 10;
		final int b = 20;
		doProcess( i -> System.out.println("Printing a : " + i), a);
		doProcess( i -> System.out.println("Adding b to a " + (i + b)), a);

		// same program by using consumer
		doProcess(x -> System.out.println("\nUsing consuler : " + x), a);
		// doProcess( x -> System.out.println("\nUsing consuler : " + (x+b)), a);
	}

	

	public static void doProcess(Consumer<Integer> p, int i) {
		p.accept(i);
	}
	
	/*public static void doProcess(Consumer<Integer> p, int i) {
		p.process(i);
	}*/
}
