package dz2.Animal.HomeAnumal.Cat;

import dz2.Interface.cat;
import dz2.Animal.HomeAnumal.HomeAnumal;

/**
 * Cat
 */
public class Cat extends HomeAnumal implements cat{
	/**
	 * @thePresenceOfWool Наличие шерсти
	 */
	Boolean thePresenceOfWool;

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
	public Cat(Double growth, Double weight, String eyeColor, String nickname, String breed, Boolean vaccinations,
			String woolColor, String dateOfBirth, Boolean thePresenceOfWool) {
		super(growth, weight, eyeColor, nickname, breed, vaccinations, woolColor, dateOfBirth);
		this.thePresenceOfWool = thePresenceOfWool;
	}

	public Boolean getThePresenceOfWool() {
		return thePresenceOfWool;
	}

	@Override
	public void ToAffection() {
		System.out.println("Мыр мыр мыр мыррррр(урчит)!");
	}

	@Override
	public void makeASound() {
		System.out.println("Мяу-мяу!");
	}

	@Override
	public String toString() {
		return super.toString() + String.format(", Наличие шерсти: %b",thePresenceOfWool);
	}
}