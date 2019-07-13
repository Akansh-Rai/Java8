/**
 * 
 */
package Java8.com.rai.methodReference.day_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Akansh_Rai
 *
 */
public class EmployeeChaniningSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Akansh", 30, "Allahabad"),
				new Employee("Sparsh", 29, "Kanpur"), new Employee("Joel", 31, "Mumbai"),
				new Employee("Sparsh", 21, "Kanpur"), new Employee("Akansh", 33, "Delhi"));

		System.out.println("************ Employee ********" + employees.toString());
		
		employees.sort(java.util.Comparator.comparing(Employee::getName));
		System.out.println("************ Employee Sort ********" + employees.toString());
		
		employees.sort(Comparator.
				comparing(Employee::getCity).
				reversed().thenComparing(Employee::getAge).
				thenComparing(Employee::getName));
		
		System.out.println("************ Employee Sort ********" + employees.toString());
	}

}
