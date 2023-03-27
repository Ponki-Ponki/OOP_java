package dz3.Figures;

import dz3.Figures.Base.Figure;
import dz3.Figures.Base.Lengthable;

public class Circle implements Figure, Lengthable,Comparable<Circle> {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle() {
		this(5);
	}

	public double length() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Круг";
	}

	@Override
	public int compareTo(Circle o) {
		return (int) (this.area() - o.area()) ;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
