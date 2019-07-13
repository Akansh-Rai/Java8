/**
 * 
 */
package Java8.com.rai.methodReference.day_1;

/**
 * @author Akansh_Rai
 *
 */
public class MyApple {

	private String country;

	private String color;

	private int weight;

	public MyApple(String _country, String _color, int _weight) {
		this.country = _country;
		this.color = _color;
		this.weight = _weight;
	}

	@Override
	public String toString() {
		return "\n Country : " + country + "   Color : " + color + " Weight : " + weight;
	}

	public String getColor() {
		return color;
	}

	public String getCountry() {
		return country;
	}

	public int getWeight() {
		return weight;
	}
}
