package dz1;

/**
 * Children'sProducts
 */
public class ChildrenProducts extends Product {
	Integer minAge;
	Boolean hypoallergen;

	/**
	 * @param minAge       минимальный возраст
	 * @param hypoallergen гипоалергенность
	 */
	public ChildrenProducts(String name, Double price, Integer quantity, String unit, Integer minAge,
			Boolean hypoallergen) {
		super(name, price, quantity, unit);
		this.minAge = minAge;
		this.hypoallergen = hypoallergen;
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit
				+ ", Минимальный возраст: " + minAge + ", Гипоалергенность: " + hypoallergen;
	}
}