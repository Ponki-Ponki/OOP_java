package dz1;

/**
 * Milk
 */
public class Milk extends Drinks{
	Double greasiness;	
	public Milk(String name, Double price, Integer quantity, String unit, String shelfLife, Integer volume,
			Double greasiness) {
		super(name, price, quantity, unit, shelfLife, volume);
		this.greasiness = greasiness;
	}
}