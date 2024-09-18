package flag.grandict;

public class Cuboid extends Rectangle{
	protected int height;
	public Cuboid() {
		this(0,0,0);
	}
	public Cuboid(int l,int w,int h) {
		super(l,w);
		this.height=h;
	}
	public double calArea() {
		return 2*(length*width+height*length+width*height);
	}
	public void show() {
		System.out.println("Cuboid Area is: "+calArea()+"\r\nprice is: "+calArea()*getPrice());
	}
}
