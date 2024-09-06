package t14_exception.t01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T2_FileNotFound {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("test.txt");
			System.out.println("test.txt파일이 존재합니다.");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("test.txt파일이 없습니다." + e.getMessage());
		}
		System.out.println("작업끝");
	}
}
