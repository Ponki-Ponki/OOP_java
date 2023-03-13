package dz1;

/**
 * Food
 */
public class Food extends Product {
	String shelfLife;

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param unit
	 * @param shelfLife Срок годности
	 */
	public Food(String name, Double price, Integer quantity, String unit, String shelfLife) {
		super(name, price, quantity, unit);
		this.shelfLife = shelfLife;
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit + ", Годен до: "
				+ shelfLife;
	}

}