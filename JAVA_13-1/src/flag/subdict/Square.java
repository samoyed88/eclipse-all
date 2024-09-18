package flag.subdict;
import flag.*;

public class Square extends Shape{
	protected  int length;
	public Square() {
		this(0);
	}
	public Square(int l) {
		this.length=l;
	}
	public double calArea() {
		return length*length;
	}
	public void show() {
		System.out.println("Square Area is: "+calArea()+"\r\nprice is: "+calArea()*getPrice());
	}
}