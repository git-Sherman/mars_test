package io_test;

import java.io.BufferedReader;

import java.io.FileReader;

public class testbufferread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader bufferedreader= null;
		try{
			fr=new FileReader("D:/user.txt");
			bufferedreader=new BufferedReader(fr);
			String line=null;
			while(true){
				line=bufferedreader.readLine();
				if(line==null){
					break;
				}
			}
			System.out.println(line);
		}
		catch(Exception e){
		System.out.println(e);
		}
		finally{
			try{
				bufferedreader.close();
				fr.close();
			}
			catch(Exception e){
				System.out.println(e);
				
			}
			
		}
	}

}
