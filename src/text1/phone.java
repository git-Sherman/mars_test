package text1;

public class phone implements USB,WIFI,C{    //implement-->实现
	
	public void read(){
		System.out.println("USB read");
	}
	
	public void write(){
		System.out.println("USB write");
	}
	
	public void open(){
		System.out.println("open wifi");
		
	}
	
	public void close(){
		System.out.println("close wifi");
	}
	
	public void funa(){
		System.out.println("jiekou A");
		
	}
	
	public void funb(){
		System.out.println("interface B");
	}
	
	public void func(){
		System.out.println("interface C");
	}

}
