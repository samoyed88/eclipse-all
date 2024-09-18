package mypackage;

public class Student extends MyPerson{
	String cla,number;
	
	public Student(){
		this("","","","","");
	}
	public Student(String n,String bir,String num,String cla,String id){
		this.name_=n;
		this.birthday=bir;
		this.number=num;
		this.cla=cla;
		this.person_id=id;
	}
	public void show() {
		System.out.println("姓名:"+name_.toString());
		System.out.println("生日:"+birthday.toString());
		System.out.println("學號:"+number.toString());
		System.out.println("班級:"+cla.toString());
		System.out.println("身分證"+person_id.toString());
	}
}
