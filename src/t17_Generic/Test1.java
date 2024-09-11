package t17_Generic;

class MyClass<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Test1 {
	public static void main(String[] args) {
		//MyClass<String> mc1 = new MyClass<String>();
		MyClass<String> mc1 = new MyClass<>();
		mc1.setT("안녕하세요");
		System.out.println("mc1 : " +mc1.getT());
		System.out.println();

		MyClass<Integer> mc2 = new MyClass<>();
		mc2.setT(100);
		System.out.println("mc2 : " + mc2.getT());
	}
}
