package t11_interface.t01;

public interface Test1 {
	//int max = 1000000;
	//public final static int MAX = 1000000;
	int MAX = 1000000;
	int MIN = 0;
	
	//public void data();
	//public abstract void data();
	void data();
	void data1(int su);
	
	default void data2() {
		// 실행할 내용을 포함/생략
		System.out.println("이곳은 data2메소드(default)");
	}
	
	static void data3() {
	// 실행할 내용을 포함/생략
			System.out.println("이곳은 data2메소드(static)");
	}
}
