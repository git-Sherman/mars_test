package test3;

import java.util.Scanner;

public class Test {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("请输入年龄");
		int age=in.nextInt();
		User User=new User();
		try{
		User.setage(age);
		}
		catch(Exception e){
			System.out.println(e);
		
		}
		
	}

}
