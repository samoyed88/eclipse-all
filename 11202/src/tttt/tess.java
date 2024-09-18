package tttt;

abstract class Animal{
	protected String name;
	protected int age;
	abstract void speak();
	abstract void sleep();
}
class Dog extends Animal{
	Dog(){
		this("",0);
	}
	Dog(String n,int a){
		this.name=n;
		this.age=a;
	}
	void speak() {
		System.out.println("I'm "+name+".is a dog.I'm "+age+" year old.");
	}
	void sleep() {
		System.out.println("I'm "+name+".I'm sleeping.");
	}
	void bark() {
		System.out.println(name+"is bark");
	}
}
