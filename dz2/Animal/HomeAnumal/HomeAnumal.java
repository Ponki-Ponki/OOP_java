package dz2.Animal.HomeAnumal;

import dz2.Animal.Animal;

/**
 * HomeAnumal
 */
public abstract class HomeAnumal extends Animal {

	String nickname;
	String breed;
	Boolean vaccinations;
	String woolColor;
	String dateOfBirth;

	/**
	 * @param growth       рост
	 * @param weight       масса
	 * @param eyeColor     цвет глаз
	 * @param nickname     прозвище
	 * @param breed        порода
	 * @param vaccinations Прививки
	 * @param woolColor    шерстяной цвет
	 * @param dateOfBirth  Дата рождения
	 */
	public HomeAnumal(Double growth, Double weight, String eyeColor, String nickname, String breed,
			Boolean vaccinations, String woolColor, String dateOfBirth) {
		super(growth, weight, eyeColor);
		this.nickname = nickname;
		this.breed = breed;
		this.vaccinations = vaccinations;
		this.woolColor = woolColor;
		this.dateOfBirth = dateOfBirth;
	}

	public void ToAffection() {
	}

	@Override
	public void printIformation() {
		System.out.println(toString());
	};

	@Override
	public String toString() {
		return super.toString() + String.format(
				", Кличка %s, Порода: %s, Прививки: %b, Цвет шерсти: %s, дата рождение: %s",
				nickname, breed, vaccinations, woolColor, dateOfBirth);
	}
}