package dz1;


/**
 * Main
 */
public class Main {
	
	public static void main(String[] args) {
		String date = "20.12.2013";
		String typeBread = "Ржаной";
		Product mineral = new Lemonade("mineralka",50.1,10,"шт",date,1000);
		Product rjanoiHleb = new Bread(typeBread +" хлеб", 24.5, 50, "шт", date, typeBread);
		Product eggs = new Egg("Куринные яица",84.9, 50, "десятков", date, 10);
		System.out.println(mineral.toString());
		System.out.println(rjanoiHleb.toString());
		System.out.println(eggs.toString());
	}
}

