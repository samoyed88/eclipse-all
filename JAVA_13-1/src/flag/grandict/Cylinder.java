package flag.grandict;
import flag.subdict.*;

public class Cylinder extends Circle{
	private int height;
	public Cylinder(){
		this(0,0);
	}
	public Cylinder(int r,int h) {
		super(r);
		this.height=h;
	}
	public double calArea() {
		return 2*super.calArea()+height*(2*PI*radius);
	}
	public void show() {
		System.out.println("Cylinder Area is: "+calArea()+"\r\nprice is: "+calArea()*getPrice());
	}
}
