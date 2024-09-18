package gperson;

public class Person {
	protected String name_;
	protected String birthday;
	protected Person() {
		// 這裡可以產生預設值或都不做任何事情
	}
	protected Person(String _name_, String _birthday) {
		this.name_ = _name_;
		this.birthday = _birthday;	
	}
}

