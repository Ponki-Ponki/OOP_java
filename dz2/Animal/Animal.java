package dz2.Animal;

/**
 * Animal
 */
public abstract class Animal {

	
	public Double growth;
	public Double weight;
	public String eyeColor;
	
	/**
	 * @param growth   рост
	 * @param weight   масса
	 * @param eyeColor цвет глаз
	 */
	public Animal(Double growth, Double weight, String eyeColor) {
		this.growth = growth;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
	
	public void makeASound() {
	};
	
	public void printIformation() {
	};

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " +String.format(
			" Рост: %4.3f м. Вес: %4.3f кг. Цвет глаз: %s ", growth, weight, eyeColor);
	}
}