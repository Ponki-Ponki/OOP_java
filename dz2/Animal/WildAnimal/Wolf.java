package dz2.Animal.WildAnimal;

/**
 * Wolf
 */
public class Wolf extends WildAnimal {

	private Boolean theLeaderOfThePack;

	/**
 	 * @param growth             рост
	 * @param weight             масса
	 * @param eyeColor           цвет глаз
	 * @param habitat			 Место обитания
	 * @param dateOfLocation	 Дата нахождения
	 * @param theLeaderOfThePack Вожак стаи
	 */
	public Wolf(Double growth, Double weight, String eyeColor, String habitat, String dateOfLocation,
			Boolean theLeaderOfThePack) {
		super(growth, weight, eyeColor, habitat, dateOfLocation);
		this.theLeaderOfThePack = theLeaderOfThePack;
	}

	public Boolean getTheLeaderOfThePack() {
		return theLeaderOfThePack;
	}

	@Override
	public void makeASound() {
		System.out.println("Вуууууууууууу!(вой)");
	}

	@Override
	public String toString() {
		return super.toString() + ", Вожак стаи: " + theLeaderOfThePack;
	}



}