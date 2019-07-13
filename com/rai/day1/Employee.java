/**
 * 
 */
package Java8.com.rai.day1;

/**
 * @author Akansh_Rai
 *
 */
public class Employee {

	private String name;

	private int age;

	public Employee(String _name, int _age) {
		this.name = _name;
		this.age = _age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name : " + name + " Age : " + age;
	}
}
