package dz2;

import java.util.Scanner;

import dz2.Animal.Animal;
import dz2.Animal.HomeAnumal.Dog;
import dz2.Animal.HomeAnumal.Cat.Cat;
import dz2.Animal.HomeAnumal.Cat.Tiger_home;
import dz2.Animal.WildAnimal.Tiger_Wild;
import dz2.Animal.WildAnimal.Wolf;
import dz2.Animal.WildAnimal.Bird.*;

public class Program {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		addAnimalStok(zoo);
		
		System.out.println("Hello, please select in menu");
		Boolean switc = true;
		while (switc) {
			printMenu();
			Integer val = (Integer) scan();
			switch (val) {
				case 1:
					addAnimal(zoo);
					break;
				case 2:
					zoo.getAnimals();
					break;
				case 3:
					Integer i = getInt("Please input number animal: ");
					if (i <= zoo.length()) {
						zoo.getAnimalInformation(i);
					}else System.out.println("error input num, please input 1-"+zoo.length());
					break;
				case 4:
					Integer a = getInt("Please input number animal: ");
					if (a <= zoo.length()) {
						zoo.MakeASound(a);
					}else System.out.println("error input num, please input 1-"+zoo.length());
					break;
				case 5:
					zoo.MakeASounds();
					break;
				case 6:
					Integer d = getInt("Please input number animal: ");
					if (d <= zoo.length()) {
						zoo.deleteAnimal(d);
					}else System.out.println("error input num, please input 1-"+zoo.length());
					break;
				case 0:
				default:
					switc = false;
					break;
			}
		}
	}

	static void printMenu() {
		System.out.println("		Menu");
		System.out.println("1. Добавить животного в зоопарк");
		System.out.println("2. Показать всех животных");
		System.out.println("3. Показать детальную информацию по животному");
		System.out.println("4. Издать звук животного");
		System.out.println("5. Пусть все кричат");
		System.out.println("6. Удалить животного из зоопарка");
		System.out.println("0. Выход");

	}

	public static void addAnimal(Zoo zoo) {
		Animal new_animal = createAnimal();
		if (new_animal == null) {
			System.out.println("Add animal error");
			return;
		}
		zoo.addAnimal(new_animal);
	}

	static Animal createAnimal() {
		Animal obj = null;
		printListAnimal();
		Integer val = (Integer) scan();
		switch (val) {
			case 1:
				obj = new Cat(getDouble("growth: "), getDouble("weight: "), getStr("eye color: "), getStr("nickname: "),
						getStr("breed: "), getBoll("vaccination: "), getStr("wool color: "), getStr("date of birth: "),
						getBoll("presence of wool: "));
				break;
			case 2:

				obj = new Tiger_home(getDouble("growth: "), getDouble("weight: "), getStr("eye color: "),
						getStr("nickname: "),
						getStr("breed: "), getBoll("vaccination: "), getStr("wool color: "), getStr("date of birth: "),
						getBoll("presence of wool: "));
				break;
			case 3:
				obj = new Tiger_Wild(getDouble("growth: "), getDouble("weight: "), getStr("eye color: "),
						getStr("habitat: "), getStr("date of location: "));
				break;
			case 4:
				obj = new Dog(getDouble("growth: "), getDouble("weight: "), getStr("eye color: "), getStr("nickname: "),
						getStr("breed: "), getBoll("vaccination: "), getStr("wool color: "), getStr("date of birth: "),
						getBoll("the presence of training: "));
				break;
			case 5:
				obj = new Wolf(getDouble("growth: "), getDouble("weight: "), getStr("eye color: "), getStr("habitat: "),
						getStr("date of location: "), getBoll("the leader of the pack: "));
				break;
			case 6:
				obj = new Chicken(getDouble("growth: "), getDouble("weight: "), getStr("eye color: "),
						getStr("habitat: "), getStr("date of location: "), getInt("flight height: "));
				break;
			case 7:
				obj = new Stork(getDouble("growth: "), getDouble("weight: "), getStr("eye color: "),
						getStr("habitat: "), getStr("date of location: "), getInt("flight height: "));
				break;
			default:
				System.out.println("Такого животного нет");
				break;
		}
		return obj;
	}

	static void printListAnimal() {
		System.out.println("Выберите какого животного добавить: ");
		System.out.println("1. Кошка");
		System.out.println("2. Тигр домашний");
		System.out.println("3. Тигр дикий");
		System.out.println("4. Собака");
		System.out.println("5. Волк");
		System.out.println("6. Курица");
		System.out.println("7. Аист");
	}

	static Integer getInt(String textM) {
		System.out.print(textM);
		Integer val = (Integer) scan();
		return val;
	}

	static Double getDouble(String textM) {
		System.out.print(textM);
		Double val = (Double) scan();
		return val;
	}

	static String getStr(String textM) {
		System.out.print(textM);
		String val = (String) scan();
		return val;
	}

	static Boolean getBoll(String textM) {
		System.out.print(textM + " (true/false) ");
		Boolean val = (Boolean) scan();
		return val;
	}

	public static Object scan() {
		Object val;
		Scanner in = new Scanner(System.in);
		if (in.hasNextBigInteger()) {
			val = in.nextInt();
		} else if (in.hasNextBigDecimal()) {
			val = in.nextDouble();
		} else if (in.hasNextBoolean()) {
			val = in.nextBoolean();
		} else
			val = in.nextLine();
		return val;
	}

	public static void addAnimalStok(Zoo zoo) {
		Animal tiger = new Tiger_home(1.0, 130.0, "blue", "Li", "tiger", false, "yeloy", "10.10.2010", true);
		Animal tiger_new = new Tiger_Wild(1.0, 130.0, "blue", "india", "10.10.2020");
		Animal birds = new Stork(0.8, 3.5, "green", "afrika", "10.10.2011", 10);
		zoo.addAnimal(birds);
		zoo.addAnimal(tiger);
		zoo.addAnimal(tiger_new);
	}
}