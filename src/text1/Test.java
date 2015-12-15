package text1;

public class Test {

	
	public static void main(String[] args) {
	
		phone phone=new phone();
//		USB usb1=new USB();//抽象类和接口（接口也是抽象类）不能用new的方法来生成一个对象
		
		USB usb=phone;//又子类向父类向上转型
		usb.read();
		usb.write();
		
		WIFI wifi=phone;
		wifi.open();
		wifi.close();
		
		
		C c=phone;
		c.funa();
		c.funb();
		c.func();
		
	}

}
