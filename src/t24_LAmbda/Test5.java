package t24_LAmbda;

@FunctionalInterface
interface MyFunc5 {
	int mul(int x, int y);
}		
public class Test5 {
	public static void main(String[] args) {
//		MyFunc5 myFunc5=new MyFunc5() {
//			@Override
//			public int mul(int x, int y) {
//				return x*y;
//			}
//		};
		
		MyFunc5 myFunc5 = (int x, int y) -> x * y;
		
		int res=myFunc5.mul(40, 50);
		System.out.println("res : " +res);	
	}	
}

