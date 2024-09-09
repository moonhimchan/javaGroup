package t15_API.t03_Class;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			System.out.println("String클래스가 존재합니다.");		
		} catch (ClassNotFoundException e) {
			System.out.println("String클래스가 존재합니다."+e.getMessage());
		}
		System.out.println("작업끝");
	}
}
