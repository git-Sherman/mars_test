package test2;

public class Exception {
	
	public static void main(String arg[]){
		System.out.println("1");
		try{						//java当中用try。。。catch。。。finally
									//来处理可能出现的异常。
		int i;
		System.out.println("2");
		i=1/1;
		System.out.println("3");
		}
		catch(java.lang.Exception e){
			e.printStackTrace();
			System.out.println("4"+"有异常");
		}
		finally{
			System.out.println("5有没有异常都要输出");
		}
		
	}
	
		
}
