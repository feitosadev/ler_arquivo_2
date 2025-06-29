package application;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program {

	public static void main(String[] args) {
		
		String path = "E:\\Programação//in.txt";
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		
		try {
			fileReader = new FileReader(path);
			bufferReader = new BufferedReader(fileReader);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}