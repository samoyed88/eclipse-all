
import flag.grandict.*;
import flag.subdict.*;

public class calArea {

	public static void main(String[] args) {
		//圓形
		Circle c=new Circle(5);
		c.setprice(10);
		c.show();
		//正方形
		Square s=new Square(2);
		s.setprice(10);
		s.show();
		//圓柱體
		Cylinder cy=new Cylinder(5,10);
		cy.setprice(10);
		cy.show();
		//長方形
		Rectangle r=new Rectangle(2,4);
		r.setprice(5);
		r.show();
		//長方體
		Cuboid cu=new Cuboid(2,4,3);
		cu.setprice(5);
		cu.show();
	}
}
