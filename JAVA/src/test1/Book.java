package test1;

public class Book{
	String c_name,e_name;
	public Book(){
		this.c_name="";
		this.e_name="";
	}
	public Book(String c,String e){
		this.c_name=c;
		this.e_name=e;
	}
	public void setCname(String c) {
		this.c_name=c;
	}
	public void setEname(String e) {
		this.e_name=e;
	}
	public void showdata() {
		System.out.println("中文:"+c_name);
		System.out.println("英文:"+e_name);
	}
	
}
