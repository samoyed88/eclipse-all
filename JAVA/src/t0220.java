import java.util.*;
import java.io.*;

abstract class classmate{
	protected String name;
	protected String id;
	public abstract String getName();
	abstract String getId();
}
class std extends classmate{
	std(){
		this("","");
	}
	std(String n,String i){
		this.name=n;
		this.id=i;
	}
	public String getName() {
		return name;
	}
	String getId() {
		return id;
	}
	
}
public class t0220 {
	public static void main(String args[ ]) 
    { 
		std s=new std("test","0123");
		System.out.printf("%s\r\n%s",s.getName(),s.getId());
	}
}