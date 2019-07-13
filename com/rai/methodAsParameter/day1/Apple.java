package Java8.com.rai.methodAsParameter.day1;

public class Apple {

	private String color;

	private int weight;

	public Apple(String _color, int _weight) {
		this.color = _color;
		this.weight = _weight;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Color : " + this.color + "  Weight : " + this.weight;
	}
}
