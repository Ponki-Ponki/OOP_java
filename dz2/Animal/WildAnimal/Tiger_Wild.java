package dz2.Animal.WildAnimal;

import dz2.Interface.cat;

public class Tiger_Wild extends WildAnimal implements cat{

	/**
 	 * @param growth            рост
	 * @param weight            масса
	 * @param eyeColor          цвет глаз
	 * @param habitat			Место обитания
	 * @param dateOfLocation	Дата нахождения
	 */
	public Tiger_Wild(Double growth, Double weight, String eyeColor, String habitat, String dateOfLocation) {
		super(growth, weight, eyeColor, habitat, dateOfLocation);
	}

	@Override
	public void makeASound() {
		System.out.println("Арррррррргррр");
	}

}
