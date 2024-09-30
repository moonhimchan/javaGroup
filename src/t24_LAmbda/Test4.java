package t24_LAmbda;

@FunctionalInterface
interface MyFunc4 {
	int sub(int x, int y);
}	
	
public class Test4 {
	public static void main(String[] args) {
		MyFunc4 myFunc4=new MyFunc4() {
			@Override
			public int sub(int x, int y) {
				return x-y;
			}
		};
		
		int res=myFunc4.sub(30, 40);
		System.out.println("res : " +res);
	}
}
