package flag.grandict;
import flag.subdict.*;

public class Rectangle extends Square{
	protected int width;
	public Rectangle() {
		this(0,0);
	}
	public Rectangle(int l,int w) {
		super(l);
		this.width=w;
	}
	public double calArea() {
		return length*width;
	}
	public void show() {
		System.out.println("Rectangle Area is: "+calArea()+"\r\nprice is: "+calArea()*getPrice());
	}
}
