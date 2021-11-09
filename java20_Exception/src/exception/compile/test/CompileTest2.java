package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading2{
	public void readFile(String filename) {
		//File
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(filename);
			System.out.println("file reading");
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}finally {
			
			try {
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}

public class CompileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReading2 fr = new FileReading2();
		String path = "C:\\miracom_edu\\javaWorkspace\\java10_Array_Primitive\\png\\message.txt";
	
		fr.readFile(path);
		
		System.out.println("success");
	}
}
