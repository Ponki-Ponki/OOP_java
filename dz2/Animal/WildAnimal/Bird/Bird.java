package dz2.Animal.WildAnimal.Bird;

import dz2.Animal.WildAnimal.WildAnimal;

/**
 * Bird
 */
public class Bird extends WildAnimal {

	private Integer flightHeight;

	/**
	 * @param growth         рост
	 * @param weight         масса
	 * @param eyeColor       цвет глаз
	 * @param habitat        Место обитания
	 * @param dateOfLocation Дата нахождения
	 * @param flightHeight   Высота полёта
	 */
	protected Bird(Double growth, Double weight, String eyeColor, String habitat, String dateOfLocation,
			Integer flightHeight) {
		super(growth, weight, eyeColor, habitat, dateOfLocation);
		this.flightHeight = flightHeight;
	}

	@Override
	public void printIformation() {
		System.out.println(toString());
	}

	public String toFly() {
		return String.format("Я лечу на %d метрах, где %d - высота полёта", flightHeight, flightHeight);
	}

	@Override
	public String toString() {
		return super.toString() + String.format(
				", Место обитания: %s, Дата нахождения: %s, Высота полёта: %s м.", habitat, dateOfLocation,
				flightHeight);
	}

}