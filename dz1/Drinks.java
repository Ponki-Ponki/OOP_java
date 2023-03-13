package dz1;

/**
 * Drinks
 */
public class Drinks extends Food{
	Integer volume;

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param unit
	 * @param shelfLife
	 * @param volume
	 */
	public Drinks(String name, Double price, Integer quantity, String unit, String shelfLife, Integer volume) {
		super(name, price, quantity, unit, shelfLife);
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", количество: " + quantity + " " + unit + ", Годен до: " + shelfLife + ", Объём: " + volume;
	}
	
}