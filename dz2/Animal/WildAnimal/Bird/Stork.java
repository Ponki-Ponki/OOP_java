package dz2.Animal.WildAnimal.Bird;

/**
 * Stork
 */
public class Stork extends Bird {

	/**
	 * @param growth         рост
	 * @param weight         масса
	 * @param eyeColor       цвет глаз
	 * @param habitat        Место обитания
	 * @param dateOfLocation Дата нахождения
	 * @param flightHeight   Высота полёта
	 */
	public Stork(Double growth, Double weight, String eyeColor, String habitat, String dateOfLocation,
			Integer flightHeight) {
		super(growth, weight, eyeColor, habitat, dateOfLocation, flightHeight);
	}

	@Override
	public void makeASound() {
		System.out.println("Тык-тык-тык-тык-тык");
	}

}