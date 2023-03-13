package dz1;

/**
 * HygieneItem
 */
public class HygieneItem extends Product {
	Integer numberOfPieces;

	/**
	 * @param numberOfPieces Количество штук в упаковке
	 */
	public HygieneItem(String name, Double price, Integer quantity, String unit, Integer numberOfPieces) {
		super(name, price, quantity, unit);
		this.numberOfPieces = numberOfPieces;
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit
				+ ", Количество штук в упаковке: " + numberOfPieces;
	}
}