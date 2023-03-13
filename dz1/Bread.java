package dz1;

/**
 * Bread
 */
public class Bread extends Food{
	String flourType;

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param unit
	 * @param shelfLife
	 * @param flourType
	 */
	public Bread(String name, Double price, Integer quantity, String unit, String shelfLife, String flourType) {
		super(name, price, quantity, unit, shelfLife);
		this.flourType = flourType;
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit + ", Годен до: " + shelfLife + ", Тип теста: " + flourType;
	}
}