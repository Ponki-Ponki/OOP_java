package dz1;

/**
 * HygieneItem
 */
public class HygieneItem extends Product{
	Integer numberOfPieces;

	public HygieneItem(String name, Double price, Integer quantity, String unit, Integer numberOfPieces) {
		super(name, price, quantity, unit);
		this.numberOfPieces = numberOfPieces;
	}
}