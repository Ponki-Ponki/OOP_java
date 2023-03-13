package dz1;

/**
 * ToiletPaper
 */
public class ToiletPaper extends HygieneItem {
	Integer numberofLayers;

	public ToiletPaper(String name, Double price, Integer quantity, String unit, Integer numberOfPieces,
			Integer numberofLayers) {
		super(name, price, quantity, unit, numberOfPieces);
		this.numberofLayers = numberofLayers;
	}
	
}