package dz3.Figures.Base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dz3.Figures.Circle;
import dz3.Figures.Rectangle;
import dz3.Figures.Square;
import dz3.Figures.Triangle;

public class ListFigure {
	List<Figure> list;

	public ListFigure(List<Figure> list) {
		this.list = list;
	}

	public ListFigure() {
		list = new ArrayList<>(0);
	}

	public void addFigure(Figure item) {
		add(item);
	}

	public void getPerimetrAll() {
		for (Figure figure : list) {
			if (figure instanceof Perimeterable) {
				System.out.println(figure);
				System.out.println(String.format("Perimeter: %.2f", ((Perimeterable) figure).perimeter()));
				System.out.println();
			}
		}
	}

	public void editFigure(int num) {
		Figure item = list.get(num);
		printInfo(item);
		// input new data
		if (item instanceof Rectangle) {
			((Rectangle) item).setAAndB(getInt("input a:"), getInt(" input b:"));
		}
		if (item instanceof Square) {
			((Square) item).setA(getInt("input a: "));
		}
		if (item instanceof Triangle) {
			((Triangle) item).setA_B_C(getInt("input a:"), getInt("input b:"), getInt("input c:"));
		}
		if (item instanceof Circle){
			((Circle) item).setRadius(getInt("input radius:"));
		}
		System.out.println();
		printInfo(item);
	}

	public void getAreaAll() {
		for (Figure figure : list) {
			System.out.println(figure);
			System.out.println(String.format("Area: %.2f", figure.area()));
			System.out.println();
		}
	}

	public void removeItem(Integer num) {
		remove(num);
	}

	public void printFigureInfo() {
		for (Figure figure : list) {
			printInfo(figure);
		}
	}

	private void printInfo(Figure item) {
		System.out.println(item);
		System.out.println(String.format("Area: %.2f", item.area()));
		if (item instanceof Perimeterable) {
			System.out.println(String.format("Perimeter: %.2f", ((Perimeterable) item).perimeter()));
		}
		if (item instanceof Lengthable) {
			System.out.println(String.format("Length: %.2f", ((Lengthable) item).length()));
		}
		System.out.println();
	}

	public void sort() {
		list.sort((i1, i2) -> Double.compare(i1.area(), i2.area()));
	}

	void add(Figure item) {
		list.add(item);
	}

	void remove(int num) {
		list.remove(num);
	}

	Integer getInt(String textM) {
		System.out.print(textM);
		Integer val = (Integer) scan();
		return val;
	}

	Double getDouble(String textM) {
		System.out.print(textM);
		Double val = (Double) scan();
		return val;
	}

	public Object scan() {
		Object val;
		try (Scanner in = new Scanner(System.in)) {
			if (in.hasNextInt()) {
				val = in.nextInt();
			} else if (in.hasNextDouble()) {
				val = in.nextDouble();
			} else if (in.hasNextBoolean()) {
				val = in.nextBoolean();
			} else
				val = in.nextLine();
		}
		return val;
	}
}
