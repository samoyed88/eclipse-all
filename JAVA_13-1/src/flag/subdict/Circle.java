package flag.subdict;
import flag.*;

public class Circle extends Shape{
	protected int radius;
	protected final double PI=3.14;
	public Circle() {
		this(0);
	}
	public Circle(int r) {
		this.radius=r;
	}
	public double calArea() {
		return PI * radius * radius ;
	}
	public void show() {
		System.out.println("Circle Area is: "+calArea()+"\r\nprice is: "+calArea()*getPrice());
	}
}
