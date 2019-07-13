/**
 * 
 */
package Java8.com.rai.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Akansh_Rai
 *
 */
public class SortingEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Akansh", 30));
		employees.add(new Employee("Arun", 30));
		System.out.println("**** Original Array ***** \n" + employees.toString());
		Comparator<Employee> comparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getAge() - emp2.getAge();
			}
		};
		
		// till java 8
		Collections.sort(employees, comparator);
		System.out.println("\n****  Sorted Array ***** \n" + employees.toString());
		
		// Java 8
		employees.sort(comparator);
		System.out.println("\n****  Sorted Array ***** \n" + employees.toString());
		
		// java 8
	}
	
}
