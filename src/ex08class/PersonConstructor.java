package ex08class;

public class PersonConstructor {
	
	String name;
	int age;
	String addr;
	
//	public PersonConstructor() {}
	
	public PersonConstructor() {
		name = "이름없음";
		age = 1;
		addr = "미상";
		System.out.println("기본생성자");
	}
	
	public PersonConstructor(String name) {
		this.name = name;
		age =1;
		addr = "미상";
		System.out.println("인자생성자[1]");
	}
	
	public PersonConstructor(String name, int age) {
		this(name, age, "미상");
		System.out.println("인자생성자[2]");
	}
	
	public PersonConstructor(String _name, int age, String addr) {
		name = _name;
		this.age = age;
		this.addr = addr;
		System.out.println("인자생성자[3]");
	}
	
	void inintialize(String name, int age, String addr) {
//		this(name, age, "미상");
		
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void showPersonInfo() {
		System.out.printf("%s 님의 정보\n",this.name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("주소:%s\n", addr);
	}

}
