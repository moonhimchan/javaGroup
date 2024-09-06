package t11_interface.t01;

public interface Test1 {
	//int max=1000000; 
	//public final static int MAX=1000000;//final 한번쓰면 바꿀수 없다>>상수처럼 변한다(대문자로 쓰기)
	int MAX=1000000;
	int MIN=0;
	
	//public void data();
	//public abstract void data();
	void data();
	void data1(int su);
	
	default void data2() {
		// 실행한 내용을 포함/생략
		System.out.println("이곳은 data2메소드(defult)");
	}
	
	static void data3() {
		//실행한 내용을 포함/생략
		System.out.println("이곳은 data2메소드(static)");
	}
}
