package dz2.Animal.HomeAnumal.Cat;

/**
 * Tiger
 */
public class Tiger_home extends Cat {

	/**
	 * @param growth            рост
	 * @param weight            масса
	 * @param eyeColor          цвет глаз
	 * @param nickname          прозвище
	 * @param breed             порода
	 * @param vaccinations      Прививки
	 * @param woolColor         шерстяной цвет
	 * @param dateOfBirth       Дата рождения
	 * @param thePresenceOfWool присутствие шерсти
	 */
	public Tiger_home(Double growth, Double weight, String eyeColor, String nickname, String breed, Boolean vaccinations,
			String woolColor, String dateOfBirth, Boolean thePresenceOfWool) {
		super(growth, weight, eyeColor, nickname, breed, vaccinations, woolColor, dateOfBirth, thePresenceOfWool);
	}

	@Override
	public void makeASound() {
		System.out.println("Арррррррргррр");
	}

}