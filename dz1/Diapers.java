package dz1;

/**
 * Diapers
 */
public class Diapers extends ChildrenProducts {
	Integer size;
	Integer minWeight, maxWeight;
	String type;

	public Diapers(String name, Double price, Integer quantity, String unit, Integer minAge, Boolean hypoallergen,
			Integer size, Integer minWeight, Integer maxWeight, String type) {
		super(name, price, quantity, unit, minAge, hypoallergen);
		this.size = size;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
		this.type = type;
	}
	
}