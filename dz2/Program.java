package dz2;

import dz2.Animal.Animal;
import dz2.Animal.HomeAnumal.Cat.Tiger_home;
import dz2.Animal.WildAnimal.Tiger_Wild;
import dz2.Animal.WildAnimal.Bird.*;

public class Program {
	public static void main(String[] args) {
		Animal tiger = new Tiger_home(1.0,130.0,"blue","Li", "tiger", false, "yeloy","10.10.2010" , true);
		tiger.printIformation();
		tiger.makeASound();
		Animal tiger_new = new Tiger_Wild(1.0, 130.0, "blue", "india", "10.10.2020");
		tiger_new.printIformation();
		tiger_new.makeASound();
		Animal birds = new Stork(0.8, 3.5, "green", "afrika", "10.10.2011", 10);
		birds.printIformation();
		birds.makeASound();
	}
}