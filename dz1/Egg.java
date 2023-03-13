package dz1;

/**
 * Egg
 */
public class Egg extends Food {
	/**
	 * количество в упаковке
	 */
	Integer volume;

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param unit
	 * @param shelfLife срок годности
	 * @param volume    количество в упакове
	 */
	public Egg(String name, Double price, Integer quantity, String unit, String shelfLife, Integer volume) {
		super(name, price, quantity, unit, shelfLife);
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit
				+ ", Количество в упаковке: " + volume;
	}
}