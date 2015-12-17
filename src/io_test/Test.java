package io_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {

	
	public static void main(String[] args) {
		//声明输入流引用
		FileInputStream fis=null;
		//声明输出流引用
		
		FileOutputStream fos=null;
		try{
			//生成代表输入流的对象
			fis=new FileInputStream("D:/from.txt");
			//生成代表输出流的对象
			fos=new FileOutputStream("D:/to.txt");
			//生成一个字节数组
			byte[] butter=new byte[1024];
			//循环读入
			while(true){
				//调用输入流的对象的read方法，读取数据
				int temp=fis.read(butter,0,butter.length);
				if(temp==-1){
					break;
				}
				fos.write(butter,0,temp);
				
			}
			
//			String s=new String(butter);
//			//调用一个String对象的trim方法，可以去除掉这个字符串的首尾空格和空字符
//			s=s.trim();
//			System.out.println(s);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
			fis.close();
			fos.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
