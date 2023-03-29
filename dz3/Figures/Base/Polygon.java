package dz_3.Figures.Base;

public abstract class  Polygon implements Figure, Perimeterable,Comparable<Polygon> {
    protected int[] sides;
    protected Polygon(int[] sides){
        this.sides = sides;
    }
    public double perimeter(){
        int sum = 0;
        for(int side : sides)
            sum += side;
        return sum;
    }
	@Override
	public int compareTo(Polygon o) {
		return (int) (this.area() - o.area()) ;
	}
}
