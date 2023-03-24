package dz2.Animal.HomeAnumal;

import dz2.Interface.dog;

/**
 * Dog
 */
public class Dog extends HomeAnumal implements dog{

	Boolean thePresenceOfTraining;

	/**
	 * @param growth       рост
	 * @param weight       масса
	 * @param eyeColor     цвет глаз
	 * @param nickname     прозвище
	 * @param breed        порода
	 * @param vaccinations Прививки
	 * @param woolColor    шерстяной цвет
	 * @param dateOfBirth  Дата рождения
	 * @param thePresenceOfTraining Наличие дрессировки:
	 */
	public Dog(Double growth, Double weight, String eyeColor, String nickname, String breed, Boolean vaccinations,
			String woolColor, String dateOfBirth, Boolean thePresenceOfTraining) {
		super(growth, weight, eyeColor, nickname, breed, vaccinations, woolColor, dateOfBirth);
		this.thePresenceOfTraining = thePresenceOfTraining;
	}

	public void Train() {
		this.thePresenceOfTraining = true;
	}

	public Boolean getThePresenceOfTraining() {
		return thePresenceOfTraining;
	}

	@Override
	public void ToAffection() {

	}

	@Override
	public void makeASound() {
		System.out.println("Гав-гав-гав");
	}

	@Override
	public String toString() {
		return super.toString() +  ", Наличие дрессировки: " + thePresenceOfTraining ;
	}

	
}