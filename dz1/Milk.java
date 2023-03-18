package dz1;

/**
 * Milk
 */
public class Milk extends Drinks {
	Double greasiness;

	/**
	 * @param greasiness Процент жирности
	 */
	public Milk(String name, Double price, Integer quantity, String unit, String shelfLife, Integer volume,
			Double greasiness) {
		super(name, price, quantity, unit, shelfLife, volume);
		this.greasiness = greasiness;
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit + ", Процент жирности: "
				+ greasiness + ", Годен до: " + shelfLife;
	}
}