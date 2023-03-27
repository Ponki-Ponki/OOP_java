package dz_3.Figures;

public class Square extends Rectangle{
    public Square(int length){
        super(length, length);

    }
    public Square(){
        this(2);
    }

	public void setA(int a) {
		for (int i = 0; i < sides.length; i++) {
			sides[i]=a;
		}
	}

    @Override
    public String toString(){
        return "Квадрат";
    }
}
