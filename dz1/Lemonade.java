package dz1;

/**
 * Lemonade
 */
public class Lemonade extends Drinks {

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param unit
	 * @param shelfLife
	 * @param volume
	 */
	public Lemonade(String name, Double price, Integer quantity, String unit, String shelfLife, Integer volume) {
		super(name, price, quantity, unit, shelfLife, volume);
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", количество: " + quantity + " " + unit + ", Годен до: " + shelfLife + ", Объём: " + volume;
	}

}