package com.demo.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {

	public static void main(String[] args) {
		FileInputStream fis=null; //to declare globally bcz to access in finally block
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("testfile.txt"); //reading from
			fos=new FileOutputStream("testcopy.txt");//writing to
			//read byte of data from the inputstream
			int x=fis.read(); 
			while(x!=-1) {
			    fos.write(x);  //write
			    x=fis.read();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("error occured");
		} catch (IOException e) {
			System.out.println("i/o error");
		}finally {
			try {
				fis.close(); 
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	

	}

}
