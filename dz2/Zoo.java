package dz2;

import dz2.Animal.Animal;

public class Zoo {

	
	private Animal[] zoo;
	
	public Zoo(Animal[] zoo) {
		this.zoo = zoo;
	}
	
	public Zoo() {
		this.zoo = new Animal[0];
	}

	public void addAnimal(Animal anim) {
		Animal[] zoo_new = new Animal[zoo.length + 1];
		if( zoo.length != 0)  
			for (int i = 0; i < zoo.length; i++) {
				zoo_new[i] = zoo[i];
			}
		zoo_new[zoo_new.length-1] = anim;
		zoo = zoo_new;
	}

	public void deleteAnimal(int num) {
		Animal[] zoo_new = new Animal[zoo.length - 1];
		int i = 0;
		for (int j = 0; j < zoo.length; j++) {
			if (j == num-1) continue;
			zoo_new[i++] = zoo[j];
		}
		zoo = zoo_new;
	}

	public void getAnimalInformation(int i) {
		zoo[i-1].printIformation();
	}

	public void MakeASound(int i) {
		zoo[i-1].makeASound();
	}

	public void getAnimals() {
		for (Animal item : zoo){
			item.printIformation();
		}
	}

	public void MakeASounds() {
		for (Animal item : zoo){
			item.makeASound();
		}
	}

	public void length() {
		System.out.println(zoo.length);	
	}
}
