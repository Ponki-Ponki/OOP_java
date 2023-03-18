package dz1;

/**
 * Mask "я не понял какие маски по этому основа от основного продукта"
 */
public class Mask extends Product {
	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param unit
	 */
	public Mask(String name, Double price, Integer quantity, String unit) {
		super(name, price, quantity, unit);
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit;
	}

}