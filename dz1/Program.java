package dz1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Program
 */
public class Program {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		LocalDate d = LocalDate.now();
		String date = d.toString();
		Product mineral = new Lemonade("mineralka", 50.1, 10, "шт", date, 1000);
		Product rjanoiHleb = new Bread("Ржаной хлеб", 24.5, 50, "шт", date, "Ржаной");
		Product eggs = new Egg("Куринные яица", 84.9, 50, "десятков", date, 10);
		Product milks = new Milk("Молоко", 40.5, 5, "шт.", date, 900, 3.2);
		Product huggies = new Diapers("HUGGIES", 499.99, 1, "уп.", 3, true, 15, 3, 8, "впитывающие");
		Product masks = new Mask("Маска", 99.9, 10, " шт.");
		Product nipples = new Nipple("Соска", 30.0, 4, "шт.", 1, true);
		Product paper = new ToiletPaper("Zeva", 210.0, 5, "рулон", 8, 4);
		products.add(mineral);
		products.add(rjanoiHleb);
		products.add(eggs);
		products.add(milks);
		products.add(huggies);
		products.add(masks);
		products.add(nipples);
		products.add(paper);
		
		printConsole(products);
	}

 	static void printConsole(ArrayList<Product> products) {
		for (Product item : products) {
			System.out.println(item.toString());
		}
	}
}
