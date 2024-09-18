package flag;

public abstract class Shape implements Surfacing{
	protected int price;
	public void setprice(int p) {
		this.price=p;
	}
	public int getPrice(){
		return price;
	}
	public abstract double calArea(); 
}
