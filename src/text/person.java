package text;

public abstract class person {
	String name;
	int age;
	String address;
	 person()
	{
		System.out.println("person的构造函数1");
	}
	void person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void introduce()
	{
		System.out.println("我的名字是"+name+"   我的年龄是"+age+"   我的地址是"+address);
	}
	void creat_s(){
		System.out.println("先创造一个person");
	}
	
	abstract void eat();
	
	

}
