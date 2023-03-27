package dz_3.Figures;

import dz_3.Figures.Base.Polygon;

public class Rectangle extends Polygon {

	public Rectangle(int a, int b) {
		super(new int[] { a, b, a, b });

	}

	public Rectangle() {
		this(2, 4);
	}

	public void setAAndB(int a,int b) {
		sides[0] = sides[2] = a;
		sides[1] = sides[3] = b;
	}


	@Override
	public double area() {
		return sides[0] * sides[1];
	}

	@Override
	public String toString() {
		return "Прямоугольник";
	}
}
