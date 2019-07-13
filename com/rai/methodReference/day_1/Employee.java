/**
 * 
 */
package Java8.com.rai.methodReference.day_1;

/**
 * @author Akansh_Rai
 *
 */
public class Employee {

	private String name;

	private int age;

	private String city;

	public Employee(String _name, int _age, String _city) {
		this.name = _name;
		this.age = _age;
		this.city = _city;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

	
	@Override
	public String toString() {
		return "\nName : " + this.name + "  age :" + this.age + "   City : " + this.city ;
	}
}
