package dz2.Animal.WildAnimal;

import dz2.Animal.Animal;

/**
 * Wild animal
 */
public abstract class WildAnimal extends Animal {

	public String habitat;
	public String dateOfLocation;

	/**
	 * @param growth         рост
	 * @param weight         масса
	 * @param eyeColor       цвет глаз
	 * @param habitat        Место обитания
	 * @param dateOfLocation Дата нахождения
	 */
	public WildAnimal(Double growth, Double weight, String eyeColor, String habitat, String dateOfLocation) {
		super(growth, weight, eyeColor);
		this.habitat = habitat;
		this.dateOfLocation = dateOfLocation;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" Место обитания: %s, Дата нахождения: %s", habitat, dateOfLocation);
	}

	@Override
	public void printIformation() {
		System.out.println(toString());
	}

}