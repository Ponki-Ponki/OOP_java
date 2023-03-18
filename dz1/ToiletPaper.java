package dz1;

/**
 * ToiletPaper
 */
public class ToiletPaper extends HygieneItem {
	Integer numberofLayers;

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param unit
	 * @param numberOfPieces
	 * @param numberofLayers Количество слоёв
	 */
	public ToiletPaper(String name, Double price, Integer quantity, String unit, Integer numberOfPieces,
			Integer numberofLayers) {
		super(name, price, quantity, unit, numberOfPieces);
		this.numberofLayers = numberofLayers;
	}

	@Override
	public String toString() {
		return "Товар " + name + ", цена: " + price + ", Количество: " + quantity + " " + unit
				+ ", Количество штук в упаковке: " + numberOfPieces + ", Количество слоёв: " + numberofLayers + "]";
	}

}