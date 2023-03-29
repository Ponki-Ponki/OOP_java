package dz_3.Figures;

import dz_3.Figures.Base.Polygon;

public class Triangle extends Polygon{
    public Triangle(int a, int b, int c){
        super(new int[]{a,b,c});

    }
    public Triangle(){
        this(3, 3, 2);
    }

	public void setA_B_C(int a,int b,int c) {
		sides[0] = a;
		sides[1] = b;
		sides[2] = c;
	}
    @Override
    public double area() {
        double p = perimeter()/2.0;
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }
    @Override
    public String toString() {
        return "Треугольник";
    }
}