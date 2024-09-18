package mypackage;

public class Teacher extends MyPerson{
	String subject;
	public Teacher(){
	}
	public Teacher(String n,String bir,String sub,String id){
		this.name_=n;
		this.birthday=bir;
		this.subject=sub;
		this.person_id=id;
	}
	public void show() {
		System.out.println("姓名:"+name_.toString());
		System.out.println("生日:"+birthday.toString());
		System.out.println("授課科目:"+subject.toString());
		System.out.println("身分證"+person_id.toString());
	}
	
}
