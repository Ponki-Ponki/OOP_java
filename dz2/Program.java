package dz2;

// import java.util.Scanner;

import dz2.Animal.Animal;
import dz2.Animal.HomeAnumal.Cat.Tiger_home;
import dz2.Animal.WildAnimal.Tiger_Wild;
import dz2.Animal.WildAnimal.Bird.*;

public class Program {

	public static void main(String[] args) {
		Animal tiger = new Tiger_home(1.0, 130.0, "blue", "Li", "tiger", false, "yeloy", "10.10.2010", true);
		Animal tiger_new = new Tiger_Wild(1.0, 130.0, "blue", "india", "10.10.2020");
		Animal birds = new Stork(0.8, 3.5, "green", "afrika", "10.10.2011", 10);

		Zoo zo = new Zoo();
		zo.addAnimal(tiger_new);
		zo.addAnimal(birds);
		zo.addAnimal(tiger);
		zo.getAnimalInformation(1);
		zo.MakeASound(2);
		zo.getAnimals();
		zo.MakeASounds();

		int variable;
		// Scanner sc = new Scanner();
		System.out.println("Helloy, please select in menu");
		Zoo zoo = new Zoo();
		while (true) {
			printMenu();
			switch (variable) {
				case 1:
					addAnimal(zoo);
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:

				case 0:
				default:
					break;
			}
		}

	}

	static void printMenu() {
		System.out.println("1. Добавить животного в зоопарк");
		System.out.println("2. Показать всех животных");
		System.out.println("3. Показать детальную информацию по животному");
		System.out.println("4. Издать звук животного");
		System.out.println("5. Пусть все кричат");
		System.out.println("6. Удалить животного из зоопарка");
		System.out.println("0-Выход");

	}

	public static void addAnimal(Zoo zoo) {
		Animal new_animal = createAnimal();
		zoo.addAnimal(new_animal);
	}

	static Animal createAnimal() {
		
		return a;
	}
}