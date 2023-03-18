package dz1;

/**
 * Nipple
 */
public class Nipple extends ChildrenProducts {

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param unit
	 * @param minAge
	 * @param hypoallergen
	 */
	public Nipple(String name, Double price, Integer quantity, String unit, Integer minAge, Boolean hypoallergen) {
		super(name, price, quantity, unit, minAge, hypoallergen);
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit
				+ ", Минимальный возраст: " + minAge + ", Гипоалергенность: " + hypoallergen;
	}

}