package dz2.Animal.WildAnimal.Bird;

/**
 * Chicken
 */
public class Chicken extends Bird {

	/**
	 * @param growth         рост
	 * @param weight         масса
	 * @param eyeColor       цвет глаз
	 * @param habitat        Место обитания
	 * @param dateOfLocation Дата нахождения
	 * @param flightHeight   Высота полёта
	 */
	public Chicken(Double growth, Double weight, String eyeColor, String habitat, String dateOfLocation,
			Integer flightHeight) {
		super(growth, weight, eyeColor, habitat, dateOfLocation, flightHeight);
	}

	@Override
	public void makeASound() {
		System.out.println("ку-ка-реку");
	}

}