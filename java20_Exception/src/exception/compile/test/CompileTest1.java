package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading{
	public void readFile(String filename) {
		//File
		
		try {
			FileReader fr = new FileReader(filename);
			System.out.println("file reading");
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
		
		
	}
}

public class CompileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReading fr = new FileReading();
		String path = "C:\\miracom_edu\\javaWorkspace\\java10_Array_Primitive\\png\\message.txt";
	
		fr.readFile(path);
		
		System.out.println("success");
	}
}
