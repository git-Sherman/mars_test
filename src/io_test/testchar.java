package io_test;

import java.io.FileReader;

import java.io.FileWriter;

public class testchar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		try{
			fr=new FileReader("D:/from.txt");
			fw=new FileWriter("D:/to.txt");
			char[] butter=new char[100];
			int temp=fr.read(butter,0,butter.length);
			fw.write(butter,0,temp);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				fr.close();
				fw.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}

	}

}
