package t24_LAmbda;

@FunctionalInterface
interface MyFunc2 {
	int add(int x, int y);
}	
	
public class Test2 {
	public static void main(String[] args) {
		MyFunc2 myFunc2=new MyFunc2() {
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		
		int res=myFunc2.add(10, 20);
		System.out.println("두수의 합: " +res);
	}
}
